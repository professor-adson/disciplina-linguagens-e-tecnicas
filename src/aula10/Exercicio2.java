package aula10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite os anos");
        int anos = s.nextInt();

        System.out.println("Digite os meses");
        int meses = s.nextInt();

        System.out.println("Digite os dias");
        int dias = s.nextInt();

        int total = (365 * anos) + (30 * meses) + dias;
        double raiz = Math.sqrt(total);

        System.out.println("A raiz quadrada dos dias (" + total + ") é " + new DecimalFormat("0.##").format(raiz));
    }
}
