package io.github.lufespi.desafio04.exercicio06.modelos;

import io.github.lufespi.desafio04.exercicio06.vendavel.Vendavel;

public class Servico implements Vendavel {
    private double preco;

    public Servico(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return preco * quantidade;
    }

    @Override
    public double aplicarDesconto(double preco, double desconto) {
        return preco - (preco * desconto / 100);
    }
}
