package aula7;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        boolean a = s.nextBoolean();

        System.out.println("Digite o segundo número:");
        boolean b = s.nextBoolean();
        boolean r1 = a && b;
        boolean r2 = a || b;

        System.out.println("AND:" + r1 + "OR:" + r2);
    }
}
