package io.github.lufespi.desafio03.exercicio01.modelos;

public class Carro {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecos(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecoAno1() {
        return precoAno1;
    }

    public double getPrecoAno2() {
        return precoAno2;
    }

    public double getPrecoAno3() {
        return precoAno3;
    }

    public double calcularMaiorPreco() {
        double maiorPreco = precoAno1;

        if (precoAno2 > maiorPreco) {
            maiorPreco = precoAno2;
        }
        if (precoAno3 > maiorPreco) {
            maiorPreco = precoAno3;
        }
        return maiorPreco;

    }

    public double calcularMenorPreco() {
        double menorPreco = precoAno1;

        if (precoAno2 > menorPreco) {
            menorPreco = precoAno2;
        }
        if (precoAno3 > menorPreco) {
            menorPreco = precoAno3;
        }
        return menorPreco;

    }

    public void exibirInformacoes() {
        String output = String.format(
                """
                Modelo: %s
                Preço Ano 1: R$%.2f
                Preço Ano 2: R$%.2f
                Preço Ano 3: R$%.2f
                Menor Preço: R$%.2f
                Maior Preço: R$%.2f
                """,
                getModelo(),
                getPrecoAno1(),
                getPrecoAno2(),
                getPrecoAno3(),
                calcularMenorPreco(),
                calcularMaiorPreco()
        );
        System.out.println(output);
    }

}
