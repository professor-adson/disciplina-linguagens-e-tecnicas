package aula7;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int a = s.nextInt();

        System.out.println("Digite o segundo número:");
        int b = s.nextInt();

        float resto = a%b;

        System.out.println("Resto:" + resto);
    }
}
