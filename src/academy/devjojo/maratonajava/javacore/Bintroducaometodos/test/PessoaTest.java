package academy.devjojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devjojo.maratonajava.javacore.Bintroducaometodos.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setIdade(30);
        pessoa.setNome("Evandro");

        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getNome());
    }
}
