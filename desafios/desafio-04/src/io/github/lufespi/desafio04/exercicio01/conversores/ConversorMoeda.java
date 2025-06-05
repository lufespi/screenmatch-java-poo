package io.github.lufespi.desafio04.exercicio01.conversores;

public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 4.80;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.printf("O valor em reais é: R$ %.2f", valorReal);
    }
}
