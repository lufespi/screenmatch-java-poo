package io.github.lufespi.desafio04.exercicio04;

import io.github.lufespi.desafio04.exercicio04.conversores.ConversorTemperaturaPadrao;

public class Main {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
        conversor.celsiusParaFahrenheit(32);
        conversor.fahrenheitParaCelsius(70);
    }
}
