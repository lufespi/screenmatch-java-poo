package io.github.lufespi.desafio02.exercicio03;

public class Main {
    public static void main(String[] args) {
        Produto produtoUm = new Produto("Shampoo" , 15.00);
        double percentualDesconto = 10;
        double valorComDesconto = produtoUm.aplicarDesconto(percentualDesconto);

        String saidaDados = String.format("""
                Nome do Produto: %s
                Preço: %.2f
                Desconto Aplicado: %.0f%%
                Valor com Desconto: R$%.2f
                """, produtoUm.getNome(), produtoUm.getPreco(), percentualDesconto, valorComDesconto
        );
        System.out.println(saidaDados);
    }
}
