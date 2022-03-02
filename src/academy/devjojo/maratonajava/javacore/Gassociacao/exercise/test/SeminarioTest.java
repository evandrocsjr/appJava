package academy.devjojo.maratonajava.javacore.Gassociacao.exercise.test;

import academy.devjojo.maratonajava.javacore.Gassociacao.exercise.domain.Estudante;
import academy.devjojo.maratonajava.javacore.Gassociacao.exercise.domain.Local;
import academy.devjojo.maratonajava.javacore.Gassociacao.exercise.domain.Professor;
import academy.devjojo.maratonajava.javacore.Gassociacao.exercise.domain.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {
        Local local = new Local("Rua armindo Jr");

        // UM ESTUDANTE ESTANDO EM UM SEMINARIO
        Seminario seminario = new Seminario("Seminario 1", local);
        Estudante estudante = new Estudante("João", 22, seminario);
        estudante.imprime();

        System.out.println();

        // UM SEMINARIO TENDO VARIOS ESTUDANTES
        Estudante estudante1 = new Estudante("Pedro", 33);
        Estudante estudante2 = new Estudante("Celio", 44);
        Local local2 = new Local("Rua J G");
        Estudante[] estudantes = {estudante1, estudante2};
        Seminario seminario2 = new Seminario("Seminario 2", local2, estudantes);
        seminario2.imprime();

        System.out.println();

        // UM PROFESSOR PODENDO MINISTRAR VARIOS SEMINARIOS
        Seminario[] seminarios = new Seminario[]{seminario, seminario2};
        Professor professor = new Professor("João Paulo", "Físico", seminarios);
        professor.imprime();

        // UM SEMINARIO DEVE TER UM LOCAL
    }
}
