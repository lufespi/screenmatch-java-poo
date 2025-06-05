package io.github.lufespi.desafio04.exercicio05.modelos;

import io.github.lufespi.desafio04.exercicio05.calculos.Calculavel;

public class ProdutoFisico implements Calculavel {
    private double preco;
    private double taxa;

    public ProdutoFisico(double preco, double taxa) {
        this.preco = preco;
        this.taxa = taxa;
    }

    @Override
    public void calcularPrecoFinal() {
        double total = preco + (preco * taxa / 100);
        System.out.printf("O preço do livro com desconto é de: R$%.2f\n",total);
    }
}
