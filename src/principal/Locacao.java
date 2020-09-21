package principal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Locacao {

    private String dFormat;
    private LocalDate dataLocacao;
    private LocalDate dataDevolucao;
    private Pessoa cliente;
    private ArrayList<Livro> livros = new ArrayList<>();
    
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    Scanner sc = new Scanner(System.in);

    public void locar(Pessoa cliente) {
        this.cliente = cliente;

        //Capturando a data de hoje
        this.dataLocacao = LocalDate.now();

        //Calculando a data de devolução.
        this.dataDevolucao = this.dataLocacao.plusDays(7);

    }

    public void addLivros(Livro livro) {
        this.livros.add(livro);
    }

    public void verLocacao() {
        
        System.out.println(">>>>>>>>>>>>>>>>>>>>>> Dados Locação <<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("Cliente: " + this.cliente.getNome());

        for (Livro livro : this.livros) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Genero: " + livro.getGenero());
            System.out.println("Data Devolução: " + this.dataDevolucao.format(dtf));
        }
    }

}


/*
        DateFormat é uma classe abstrata e a SimpleDate uma classe especialista
        Usamos a classe especialista  SimpleDateFormat para definir o formato que iremos trabalhar com
        datas.
        dd = dia
        MM = mês
        yyyy = ano
    */
