package io.github.lufespi.desafio04.exercicio06;

import io.github.lufespi.desafio04.exercicio06.modelos.Produto;
import io.github.lufespi.desafio04.exercicio06.modelos.Servico;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto(50);
        Servico servico = new Servico(100);
        System.out.println(String.format("Preço total do produto (5 unidades): R$%.2f", produto.calcularPrecoTotal(5)));
        System.out.println(String.format("Preço total do serviço (3 unidades): R$%.2f", servico.calcularPrecoTotal(3)));
        System.out.println(String.format("Preço com desconto do produto: R$%.2f", produto.aplicarDesconto(50, 10)));
    }
}
