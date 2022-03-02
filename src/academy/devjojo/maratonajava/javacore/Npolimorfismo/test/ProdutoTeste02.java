package academy.devjojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devjojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devjojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devjojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 5", 2000);
        Produto produto1 = new Tomate("Americano", 20);

        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("---------");
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        
    }
}
