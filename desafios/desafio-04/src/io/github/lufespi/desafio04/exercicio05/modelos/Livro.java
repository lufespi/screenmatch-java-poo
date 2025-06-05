package io.github.lufespi.desafio04.exercicio05.modelos;

import io.github.lufespi.desafio04.exercicio05.calculos.Calculavel;

public class Livro implements Calculavel {
    private double preco;
    private double desconto;

    public Livro(double preco, double desconto) {
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public void calcularPrecoFinal() {
        double total = preco - (preco * desconto / 100);
        System.out.printf("O preço do produto com a taxa é de: R$%.2f\n", total);
    }
}
