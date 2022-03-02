package academy.devjojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devjojo.maratonajava.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Evandro");
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
