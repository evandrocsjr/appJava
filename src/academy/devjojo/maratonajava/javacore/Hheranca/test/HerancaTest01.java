package academy.devjojo.maratonajava.javacore.Hheranca.test;

import academy.devjojo.maratonajava.javacore.Hheranca.domain.Endereco;
import academy.devjojo.maratonajava.javacore.Hheranca.domain.Funcionario;
import academy.devjojo.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 2");
        endereco.setCep("97043-190");

        Pessoa pessoa = new Pessoa("Fulano");
        pessoa.setNome("Evandro");
        pessoa.setCpf("123.123.123-23");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println();
        Funcionario funcionario = new Funcionario("Fulano");
//        funcionario.setNome("João");
        funcionario.setCpf("23112312312");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(22.11);

        funcionario.imprime();
    }
}
