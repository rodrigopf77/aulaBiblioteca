package principal;

public class TesteDeMesa2 {
    
    public static void main(String[] args) {
        
        int gols = 5;
        int cartao = 6;
        double salario = 1500;
        
        for (int i = 0; i < gols; i++) {
            salario += gols * 1000;
            salario += cartao * 100;
            gols--;
            cartao --;
        }
        System.out.println("Salário: " + salario);
        System.out.println("Gols: " + gols);
        System.out.println("Cartões: " + cartao);
    }
    
}
