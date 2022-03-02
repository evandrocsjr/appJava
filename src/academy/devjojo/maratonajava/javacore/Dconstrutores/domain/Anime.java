package academy.devjojo.maratonajava.javacore.Dconstrutores.domain;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;
    private String estudio;

    public Anime(String tipo, int episodios, String nome, String genero) {
        this.tipo = tipo;
        this.episodios = episodios;
        this.nome = nome;
        this.genero = genero;
    }

    public Anime(String tipo, int episodios, String nome, String genero, String estudio) {
        this(tipo, episodios, nome, genero);
        this.estudio = estudio;
    }

    public void init(String tipo, int episodios, String nome) {
        this.tipo = tipo;
        this.episodios = episodios;
        this.nome = nome;
    }

    public void init(String tipo, int episodios, String nome, String genero) {
        this.init(tipo, episodios, nome);
        this.genero = genero;
    }

    public void imprime() {
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.nome);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private String getTipo() {
        return tipo;
    }
}
