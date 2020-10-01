package principal;

public class TesteProva6 {
    
    public static void main(String[] args) {
        int gols = 3;
        int cartao = 0;
        double salario = 1000;
        double bonus = 10000;

        for (int i = 0; i <= gols; i++) {

            if (cartao > 5 && gols < 3) {
                salario += gols * 1000;
                salario -= cartao * 100;
                if (gols == 0) {
                    salario -= 150;
                }else{
                    salario -= gols * 100;
                }
            }else if (cartao > 0 && cartao <= 5) {
                salario += gols * 2000;
                salario -= cartao * 50;
            }else{
                salario -= (gols * 3000) + bonus;
            }
        }

        System.out.println("Salario: " + salario);
    }
    
}
