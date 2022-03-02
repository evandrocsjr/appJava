package academy.devjojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devjojo.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTeste2 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicaDoisNumeros(2, 3);
        double result = calculadora.divideDoisNumeros(20, 10);
        System.out.println(result);
    }
}
