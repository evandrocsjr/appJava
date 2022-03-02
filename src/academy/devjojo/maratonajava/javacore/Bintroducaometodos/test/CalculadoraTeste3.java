package academy.devjojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devjojo.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTeste3 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 343;
        int num2 = 34;
        calculadora.alteraDoisNumeros(num1, num2);
    }
}
