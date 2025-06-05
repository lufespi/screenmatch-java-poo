package io.github.lufespi.minhasmusicas.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() > 8) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto.");
        } else {
            System.out.println(audio.getTitulo() + " é considerado um dos que todo mundo está curtindo.");
        }
    }

}
