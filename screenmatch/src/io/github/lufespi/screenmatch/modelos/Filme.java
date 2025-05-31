package io.github.lufespi.screenmatch.modelos;

public class Filme {
    private String nome;
    private int anoLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void exibeFichaTecnica() {
        String fichaTecnica = String.format("""
                Nome do Filme: %s
                Ano de Lançamento: %d
                Duração: %d minutos
                Incluído no Plano: %b
                """, nome, anoLancamento, duracaoEmMinutos, incluidoNoPlano);
        System.out.println(fichaTecnica);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalAvaliacoes;
    }
}
