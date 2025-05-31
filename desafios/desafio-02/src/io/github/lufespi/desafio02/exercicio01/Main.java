package io.github.lufespi.desafio02.exercicio01;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancariaUm = new ContaBancaria();

        contaBancariaUm.setNumeroConta(1221);
        contaBancariaUm.setSaldo(2500.00);
        contaBancariaUm.titular = "Luis Fernando Souza Pinto";

        String saidaDados = String.format("""
                Número da Conta: %s
                Titular da Conta: %s
                Saldo Total: R$ %.2f           
                """, contaBancariaUm.titular, contaBancariaUm.getNumeroConta(), contaBancariaUm.getSaldo()
        );

        System.out.println(saidaDados);
    }
}
