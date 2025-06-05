package io.github.lufespi.desafio04.exercicio02.calculadora;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    @Override
    public void calcularArea(double altura, double largura) {
        double areaTotal = altura * largura;
        System.out.printf("Área Total: %.2fm²\n", areaTotal);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetroTotal = 2 * (altura + largura);
        System.out.printf("Perímetro: %.2fm\n", perimetroTotal);
    }
}
