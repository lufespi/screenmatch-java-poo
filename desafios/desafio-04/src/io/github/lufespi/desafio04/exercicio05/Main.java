package io.github.lufespi.desafio04.exercicio05;

import io.github.lufespi.desafio04.exercicio05.modelos.Livro;
import io.github.lufespi.desafio04.exercicio05.modelos.ProdutoFisico;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro(59.9, 10);
        livro.calcularPrecoFinal();

        ProdutoFisico produto = new ProdutoFisico(15, 4.9);
        produto.calcularPrecoFinal();
    }
}
