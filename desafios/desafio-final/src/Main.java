import io.github.lufespi.minhasmusicas.modelos.MinhasPreferidas;
import io.github.lufespi.minhasmusicas.modelos.Musica;
import io.github.lufespi.minhasmusicas.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Flow Podcast");
        meuPodcast.setApresentador("Monark");

        for (int i = 0; i < 2500; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 900; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
