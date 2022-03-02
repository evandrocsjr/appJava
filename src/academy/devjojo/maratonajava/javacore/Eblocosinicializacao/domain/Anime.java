package academy.devjojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        System.out.println("Sempre será inicializado");
        this.episodios = new int[100];
        for (int i = 0; i < this.episodios.length; i++) {
            this.episodios[i] += i;
        }
    }

    public Anime(String nome) {
        this();
        this.nome = nome;
    }

    public Anime() {
        for (int ep : this.episodios) {
            System.out.print(ep + " ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
