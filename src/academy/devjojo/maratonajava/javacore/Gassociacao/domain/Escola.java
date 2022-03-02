package academy.devjojo.maratonajava.javacore.Gassociacao.domain;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this(nome);
        this.professores = professores;
    }

    public void imprime() {
        System.out.println("Nome da escola: " + this.nome);
        if (professores == null) return;

        System.out.println("Professores:");
        for (Professor professor : professores) {
            System.out.println(professor.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
