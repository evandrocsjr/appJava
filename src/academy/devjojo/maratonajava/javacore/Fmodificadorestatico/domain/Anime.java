package academy.devjojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("Sempre será inicializado");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] += i;
        }
    }

    static {
        System.out.println("Bloco 2");
    }

    public Anime(String nome) {
        this();
        this.nome = nome;
    }

    public Anime() {
        for (int ep : episodios) {
            System.out.print(ep + " ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
