public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaDasAvaliacoes;
    int numAvaliacoes;

    void fichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }

    void  avaliarMusica(double nota){
        somaDasAvaliacoes += nota;
        numAvaliacoes++;
    }

    double calcularMediaAvaliacoes(){
        return somaDasAvaliacoes / numAvaliacoes;
    }
}
