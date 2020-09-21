package principal;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String email;
    
    Scanner sc = new Scanner(System.in);
    
    public void criarPessoa(){
        System.out.print("Nome Pessoa: ");
        this.nome = sc.nextLine();
        
        System.out.print("Emai: ");
        this.email = sc.nextLine();
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
