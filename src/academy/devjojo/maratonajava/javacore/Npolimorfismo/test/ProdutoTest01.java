package academy.devjojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devjojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devjojo.maratonajava.javacore.Npolimorfismo.domain.Televisao;
import academy.devjojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devjojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("PC01", 20000);
        Tomate tomate = new Tomate("Tomate aleatório", 10);
        Televisao tv = new Televisao("TV Samsung", 5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println();
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println();
        CalculadoraImposto.calcularImposto(tv);

    }
}
