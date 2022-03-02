package academy.devjojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devjojo.maratonajava.javacore.Bintroducaometodos.domain.Estudante;

public class EstudanteTest2 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Evandro";
        estudante1.idade = 22;
        estudante1.sexo = 'M';
        estudante1.imprime();

        estudante2.nome = "João";
        estudante2.sexo = 'F';
        estudante2.idade = 45;
        estudante2.imprime();

    }
}
