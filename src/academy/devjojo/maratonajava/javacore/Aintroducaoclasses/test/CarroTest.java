package academy.devjojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devjojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fiat";
        carro1.ano = 1947;
        carro1.modelo = "Fiat47";
        carro1.imprime();

        System.out.println();

        carro2.nome = "Toyota";
        carro2.ano = 2021;
        carro2.modelo = "Corolla";
        carro2.imprime();
    }
}
