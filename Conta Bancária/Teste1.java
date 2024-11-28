package teste1;
public class Teste1 {
    public static void main(String[] args) {
        
        ContaBancaria c1 = new ContaBancaria(4100, "Conta Corrente", "André", 01, true);
        
        System.out.println(c1.getSaldo());
        System.out.println();
        c1.DadosBancarios();
        
    }
    
}
