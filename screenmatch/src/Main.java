import io.github.lufespi.screenmatch.calculos.CalculadoraDeTempo;
import io.github.lufespi.screenmatch.modelos.Filme;
import io.github.lufespi.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme filmeUm = new Filme();
        filmeUm.setNome("Top Gun: Maverick");;
        filmeUm.setAnoLancamento(2022);
        filmeUm.setDuracaoEmMinutos(120);
        filmeUm.setIncluidoNoPlano(true);

        Filme filmeDois = new Filme();
        filmeDois.setNome("Homem de Ferro");;
        filmeDois.setAnoLancamento(2008);
        filmeDois.setDuracaoEmMinutos(150);
        filmeDois.setIncluidoNoPlano(true);

        filmeUm.exibeFichaTecnica();

        filmeUm.avalia(10.0);
        filmeUm.avalia(8.0);
        filmeUm.avalia(9.5);

//        System.out.printf("Média de Avaliações: %.1f\n\n" , filmeUm.pegaMedia());

        Serie serieUm = new Serie();
        serieUm.setNome("Breaking Bad");
        serieUm.setAnoLancamento(2008);
        serieUm.setTemporadas(6);
        serieUm.setEpisodiosPorTemporada(13);
        serieUm.setMinutosPorEpisodio(50);
        serieUm.setIncluidoNoPlano(true);

        serieUm.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filmeUm);
        calculadora.inclui(filmeDois);
        System.out.println(calculadora.getTempoTotal());
    }
}
