package io.github.lufespi.desafio02.exercicio03;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double aplicarDesconto(double percentual) {
        double desconto = preco * (percentual / 100);
        double valorComDesconto = preco - desconto;

        return valorComDesconto;
    }
}
