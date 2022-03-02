package academy.devjojo.maratonajava.javacore.Bintroducaometodos.exercise.test;

import academy.devjojo.maratonajava.javacore.Bintroducaometodos.exercise.domain.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setName("Evandro");
        funcionario.setIdade(22);
        funcionario.setSalario(new double[]{623.22, 442.44, 355.44});

        funcionario.imprimir();
    }
}