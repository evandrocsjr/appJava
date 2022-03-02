package academy.devjojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devjojo.maratonajava.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTeste2 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        estudante1.nome = "Evandro";

        System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.sexo);
    }
}
