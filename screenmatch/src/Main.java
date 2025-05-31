import io.github.lufespi.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme filmeUm = new Filme();
        filmeUm.setNome("Top Gun: Maverick");;
        filmeUm.setAnoLancamento(2022);
        filmeUm.setDuracaoEmMinutos(120);
        filmeUm.setIncluidoNoPlano(true);

        filmeUm.exibeFichaTecnica();

        filmeUm.avalia(10.0);
        filmeUm.avalia(8.0);
        filmeUm.avalia(9.5);

        System.out.printf("Média de Avaliações: %.1f" , filmeUm.pegaMedia());
    }
}
