package academy.devjojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome abaixo:");
        String nome = input.nextLine();
        System.out.println("Digite sua idade: ");
        String idade = input.nextLine();
        System.out.println("Digite seu sexo: M ou F ");
        char sexo = input.next().charAt(0);

        System.out.println("Seu nome: " + nome);
        System.out.println("Sua idade: " + idade);
        System.out.println("Seu sexo: " + sexo);
    }
}
