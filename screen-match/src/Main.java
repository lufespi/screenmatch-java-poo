public class Main {
    public static void main(String[] args) {
        Filme filmeUm = new Filme();
        filmeUm.nome = "Top Gun: Maverick";
        filmeUm.anoLancamento = 2022;
        filmeUm.duracaoEmMinutos = 120;
        filmeUm.incluidoNoPlano = true;

        filmeUm.exibeFichaTecnica();

        filmeUm.avalia(10.0);
        filmeUm.avalia(8.0);
        filmeUm.avalia(9.5);

        System.out.printf("Média de Avaliações: %.1f" , filmeUm.pegaMedia());
    }
}
