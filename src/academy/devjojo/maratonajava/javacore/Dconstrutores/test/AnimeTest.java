package academy.devjojo.maratonajava.javacore.Dconstrutores.test;


import academy.devjojo.maratonajava.javacore.Dconstrutores.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Anime", 233, "Pokemon", "Loucurage", "Um estúdio");
        anime.imprime();
    }
}
