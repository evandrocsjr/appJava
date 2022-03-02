package academy.devjojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Calculadora {

    public void somarDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros() {
        System.out.println(20 - 1);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 33;
        num2 = 44;
        System.out.println("Dentro de alteraDoisNumeros:");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }

    public void somaArray(int[] numeros) {
        int result = 0;
        for (int num : numeros) {
            result += num;
        }
        System.out.println(result);
    }

    public void somaVarArgs(int... numeros) {
        int result = 0;
        for (int num : numeros) {
            result += num;
        }
        System.out.println(result);
    }
}
