package academy.devjojo.maratonajava.javacore.Aintroducaoclasses.domain;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo = 'M';

    public void imprime(Estudante estudante) {
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
    }
}
