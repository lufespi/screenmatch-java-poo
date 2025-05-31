public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.titulo = "Fallen Order";
        musica.artista = "Dragon Force";
        musica.anoLancamento = 2012;

        musica.avaliarMusica(8);
        musica.avaliarMusica(7.5);
        musica.avaliarMusica(10);

        double mediaAvaliacoes = musica.calcularMediaAvaliacoes();

        musica.fichaTecnica();
        System.out.println("Média das avaliações: " + mediaAvaliacoes);
    }
}
