public class Filme {
    String nome;
    int anoLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalAvaliacoes;

    void exibeFichaTecnica() {
        String fichaTecnica = String.format("""
                Nome do Filme: %s
                Ano de Lançamento: %d
                Duração: %d minutos
                Incluído no Plano: %b
                """, nome, anoLancamento, duracaoEmMinutos, incluidoNoPlano);
        System.out.println(fichaTecnica);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / totalAvaliacoes;
    }
}
