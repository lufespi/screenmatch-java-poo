package io.github.lufespi.desafio04.exercicio06.vendavel;

public interface Vendavel {
    double calcularPrecoTotal(int quantidade);
    double aplicarDesconto(double preco, double desconto);
}
