package io.github.lufespi.desafio04.exercicio03.tabuada;

public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            int total = i * numero;
            System.out.println(numero + "x" + i + " = " + total);
        }
    }
}
