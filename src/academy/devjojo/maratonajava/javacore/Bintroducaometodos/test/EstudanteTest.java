package academy.devjojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devjojo.maratonajava.javacore.Bintroducaometodos.domain.Estudante;
import academy.devjojo.maratonajava.javacore.Bintroducaometodos.domain.ImprimeEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImprimeEstudante imprime = new ImprimeEstudante();

        estudante1.nome = "Evandro";
        estudante1.idade = 22;
        estudante1.sexo = 'M';
        imprime.imprime(estudante1);

        estudante2.nome = "João";
        estudante2.sexo = 'F';
        estudante2.idade = 45;
        imprime.imprime(estudante2);
    }
}
