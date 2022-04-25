package aula12;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("n: ");
        int n = s.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Incluir em x: ");
            x[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Incluir em y: ");
            y[i] = s.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                soma += x[i] * y[j];
            }
        }

        System.out.println(soma);
    }
}
