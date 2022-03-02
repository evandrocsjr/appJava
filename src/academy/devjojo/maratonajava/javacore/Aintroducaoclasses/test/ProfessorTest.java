package academy.devjojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devjojo.maratonajava.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.sexo = 'M';
        professor.nome = "João";

        System.out.println(professor.nome);
        System.out.println(professor.sexo);
    }

}
