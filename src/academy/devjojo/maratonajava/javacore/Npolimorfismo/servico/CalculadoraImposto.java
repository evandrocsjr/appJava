package academy.devjojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devjojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devjojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println("Validade do tomate " + tomate.getDataValidade());
        }
    }
}
