package academy.devjojo.maratonajava.javacore.Bintroducaometodos.exercise.domain;

public class Funcionario {
    private String name;
    private int idade;
    private double[] salario;
    private double media;

    public void imprimir() {
        System.out.println(this.name);
        System.out.println(this.idade);
        if (salario == null) {
            return;
        }
        for (double sal : salario) {
            System.out.println(sal);
        }
        mediaSalarios();
    }

    private void mediaSalarios() {
        if (salario == null) {
            return;
        }
        for (double sal : this.salario) {
            media += sal;
        }
        media /= salario.length;
        System.out.println("Media salarial: " + media);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }
}
