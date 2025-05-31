package io.github.lufespi.desafio02.exercicio04;

public class Main {
    public static void main(String[] args) {
        Aluno alunoUm = new Aluno("Luis Fernando Souza Pinto" , 10, 5.5, 4.5);

        String saidaDados = String.format(
                """
                Nome do Aluno: %s
                Nota 1: %.1f
                Nota 2: %.1f
                Nota 3: %.1f
                Média: %.1f
                """, alunoUm.getNome(), alunoUm.getNotaUm(), alunoUm.getNotaDois(), alunoUm.getNotaTres(), alunoUm.calculaMedia()
        );

        System.out.println(saidaDados);
    }
}
