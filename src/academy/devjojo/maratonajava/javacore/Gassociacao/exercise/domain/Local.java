package academy.devjojo.maratonajava.javacore.Gassociacao.exercise.domain;

public class Local {
    private String endereco;

    public void imprime() {
        System.out.println(this.endereco);
    }

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
