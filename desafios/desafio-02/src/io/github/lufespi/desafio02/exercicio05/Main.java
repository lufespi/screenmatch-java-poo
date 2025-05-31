package io.github.lufespi.desafio02.exercicio05;

public class Main {
    public static void main(String[] args) {
        Livro livroUm = new Livro("Harry Potter" , "J. R. R. Tolkien");

        String saidaDados = String.format(
                """
                Título do Livro: %s
                Autor: %s        
                """, livroUm.getTitulo(), livroUm.getAutor()
        );

        System.out.println(saidaDados);
    }
}
