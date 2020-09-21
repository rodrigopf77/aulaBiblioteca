package principal;

import java.util.Scanner;

public class Livro {
    private String titulo;
    private String genero;
    private Autor autor;
    
    Scanner sc = new Scanner(System.in);
    
    public void criarLivro(Autor autor){
        this.autor = autor;
        
        System.out.print("Título: ");
        this.titulo = sc.nextLine();
        
        System.out.print("Genero: ");
        this.genero = sc.nextLine();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    
    
}
