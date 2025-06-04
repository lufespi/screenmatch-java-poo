package io.github.lufespi.desafio03.exercicio02;

import io.github.lufespi.desafio03.exercicio02.modelos.Cachorro;
import io.github.lufespi.desafio03.exercicio02.modelos.Gato;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();
    }
}
