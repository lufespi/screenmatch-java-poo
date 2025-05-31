package io.github.lufespi.desafio02.exercicio04;

public class Aluno {
    private String nome;
    private double notaUm;
    private double notaDois;
    private double notaTres;

    public Aluno(String nome, double notaUm, double notaDois, double notaTres) {
        this.nome = nome;
        this.notaUm = notaUm;
        this.notaDois = notaDois;
        this.notaTres = notaTres;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaUm() {
        return notaUm;
    }

    public void setNotaUm(double notaUm) {
        this.notaUm = notaUm;
    }

    public double getNotaDois() {
        return notaDois;
    }

    public void setNotaDois(double notaDois) {
        this.notaDois = notaDois;
    }

    public double getNotaTres() {
        return notaTres;
    }

    public void setNotaTres(double notaTres) {
        this.notaTres = notaTres;
    }

    public double calculaMedia() {
        double somaMedia = (notaUm + notaDois + notaTres) / 3;
        return somaMedia;
    }
}
