
package teste1;


public class ContaBancaria {
    
    private double saldo;
    private String tipoConta;
    private String proprietario;
    private int numConta;
    private boolean status;
    
    public ContaBancaria(double s, String tC, String p, int numC, boolean stat){
        this.saldo = s;
        this.tipoConta = tC;
        this.proprietario = p;
        this.numConta = numC;
        this.status = stat;
    }

    public double getSaldo() {
        
        return saldo;
    }

    public void setSaldo(double s) {
        this.saldo = s;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public boolean getStatus() {
        return status;
    }
    
    public void abrirConta(){
        this.status = true;
    }
    
    public void fecharConta(){
        this.status = false;
    }
    
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }
    
    public void sacar(double valor){
        this.saldo = this.saldo - valor;
    }
    
    public void pagarAnuidade(double valor){
        this.saldo = this.saldo - valor;
    }
    
    public void DadosBancarios(){
        System.out.println("Dados Bancários: ");
        System.out.println("Saldo: "+this.saldo);
        System.out.println("Tipo conta: "+this.tipoConta);
        System.out.println("Proprietário: "+this.proprietario);
        System.out.println("Número da conta: "+this.numConta);
        System.out.println("Conta aberta: "+this.status);
    }
    
}
