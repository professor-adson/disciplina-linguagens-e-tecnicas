package aula8;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o número inteiro");
        int n1 = s.nextInt();

        System.out.println("Digite o número fracionário");
        double n2 = s.nextDouble();

        double soma = n1 + n2;

        System.out.println("A soma dos números " + n1 + " e " + n2 + " é " + soma);
    }
}
