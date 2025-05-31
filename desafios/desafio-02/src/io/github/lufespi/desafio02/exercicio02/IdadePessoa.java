package io.github.lufespi.desafio02.exercicio02;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String verificaIdade() {
        if (idade < 18) {
            return "Menor de Idade";
        } else {
            return "Maior de Idade";
        }
    }
}
