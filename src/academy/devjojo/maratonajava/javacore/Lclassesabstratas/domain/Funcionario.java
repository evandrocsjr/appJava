package academy.devjojo.maratonajava.javacore.Lclassesabstratas.domain;

public abstract class Funcionario extends Pessoa {
    // CLASSE ABSTRATA NÃO PODEM SER INSTANCIADAS, ESTA CLASSE SERVE SOMENTE PARA SER ESTENDIDA
    // O modificador protected torna o membro acessível às classes do mesmo pacote ou através de herança
    protected String nome;
    protected double salario;

    @Override
    public void imprime() {
        System.out.println("Imprimindo");
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public abstract void calculaBonus();
}
