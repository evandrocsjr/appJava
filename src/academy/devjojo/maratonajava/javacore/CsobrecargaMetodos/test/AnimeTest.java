package academy.devjojo.maratonajava.javacore.CsobrecargaMetodos.test;

import academy.devjojo.maratonajava.javacore.CsobrecargaMetodos.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Anime", 233, "Pokemon", "Loucurage");
        anime.imprime();
    }
}
