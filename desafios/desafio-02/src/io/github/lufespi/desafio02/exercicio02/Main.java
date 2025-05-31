package io.github.lufespi.desafio02.exercicio02;

public class Main {
    public static void main(String[] args) {
        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("Luis Fernando Souza Pinto");
        pessoa.setIdade(21);

       String saidaDados = String.format("""
               Nome: %s
               Idade: %d
               %s
               """, pessoa.getNome(), pessoa.getIdade(), pessoa.verificaIdade()
       );

        System.out.println(saidaDados);

    }
}
