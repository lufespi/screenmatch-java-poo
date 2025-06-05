package io.github.lufespi.desafio04.exercicio04.conversores;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public void celsiusParaFahrenheit(double valorCelsius) {
        double fahrenheit = (valorCelsius * 1.8) + 32;
        System.out.printf("%.1fºC para Fahrenheit é igual a %.1fºF\n", valorCelsius, fahrenheit);
    }

    @Override
    public void fahrenheitParaCelsius(double valorFahrenheit) {
        double celsius = (valorFahrenheit - 32) * 1.8;
        System.out.printf("%.1fºF para Celsius é igual a %.1fºC\n", valorFahrenheit, celsius);
    }
}
