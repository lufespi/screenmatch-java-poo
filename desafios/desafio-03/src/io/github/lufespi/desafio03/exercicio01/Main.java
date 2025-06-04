package io.github.lufespi.desafio03.exercicio01;

import io.github.lufespi.desafio03.exercicio01.modelos.ModeloCarro;

public class Main {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.setModelo("Creta");
        meuCarro.setPrecos(30000, 32000, 35000);
        meuCarro.exibirInformacoes();
    }

}
