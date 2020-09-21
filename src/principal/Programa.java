package principal;

public class Programa {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        pessoa.criarPessoa();
        
        Autor autor = new Autor();
        autor.criarPessoa();
        
        Livro livro = new Livro();
        livro.criarLivro(autor);
        
        Livro livro2 = new Livro();
        livro2.criarLivro(autor);
        
        Locacao locacao = new Locacao();
        locacao.locar(pessoa);
        locacao.addLivros(livro);
        locacao.addLivros(livro2);
        locacao.verLocacao();
        

    }
    
}
