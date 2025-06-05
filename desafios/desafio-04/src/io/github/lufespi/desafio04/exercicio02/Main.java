package io.github.lufespi.desafio04.exercicio02;

import io.github.lufespi.desafio04.exercicio02.calculadora.CalculadoraSalaRetangular;

public class Main {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
        calculadora.calcularArea(10, 20);
        calculadora.calcularPerimetro(10, 20);
    }
}
