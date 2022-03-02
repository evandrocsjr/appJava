package academy.devjojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devjojo.maratonajava.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        estudante.nome = "Evandro";
        estudante.sexo = 'M';
        estudante.idade = 22;

        estudante2.nome = "Pedro";
        estudante2.idade = 33;
        estudante2.sexo = 'F';

        estudante.imprime(estudante);
        estudante2.imprime(estudante2);
    }
}
