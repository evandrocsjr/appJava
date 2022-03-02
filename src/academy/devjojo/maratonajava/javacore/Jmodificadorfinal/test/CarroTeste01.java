package academy.devjojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devjojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devjojo.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);

        carro.COMPRADOR.setNome("Evandro");
        carro.COMPRADOR.setEndereco("Rua 2");

        System.out.println(carro.COMPRADOR.getNome());
        System.out.println(carro.COMPRADOR.getEndereco());

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("ferrari teste");
        ferrari.imprime();
    }
}
