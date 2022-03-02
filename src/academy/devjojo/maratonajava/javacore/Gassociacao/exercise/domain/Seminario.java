package academy.devjojo.maratonajava.javacore.Gassociacao.exercise.domain;

public class Seminario {
    private String titulo;
    private Estudante[] estudantes;
    private Local local;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Estudante[] estudantes) {
        this.titulo = titulo;
        this.local = local;
        this.estudantes = estudantes;
    }

    public void imprime() {
        System.out.println("Nome do seminário: " + this.titulo);
        System.out.println("Local: " + local.getEndereco());
        if (estudantes == null) return;

        for (Estudante estudante : estudantes) {
            System.out.println(estudante.getNome());
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
