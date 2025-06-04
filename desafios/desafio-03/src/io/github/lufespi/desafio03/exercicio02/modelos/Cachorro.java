package io.github.lufespi.desafio03.exercicio02.modelos;

public class Cachorro extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Au Au!");;
    }

    public void abanarRabo() {
        System.out.println("Cachorro abanando o rabo");
    }
}
