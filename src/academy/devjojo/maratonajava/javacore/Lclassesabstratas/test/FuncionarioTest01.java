package academy.devjojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devjojo.maratonajava.javacore.Lclassesabstratas.domain.Desenvolvedor;
import academy.devjojo.maratonajava.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Evandro", 10000);
        gerente.imprime();
        System.out.println(gerente);

        desenvolvedor.imprime();
        System.out.println(desenvolvedor);
    }
}
