package academy.devjojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devjojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devjojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devjojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devjojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Computador computador = new Computador("Ryzen 5", 2000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/11/2022");

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
