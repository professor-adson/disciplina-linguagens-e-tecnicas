package aula10;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a temperatura em ºC:");
        double c = s.nextDouble();

        double f = c * 1.8 + 32;
        double k = c + 273.15;
        double re = c * 0.8;
        double ra = c * 1.8 + 32 + 459.67;

        System.out.println("Kelvin: " + k + "\n");
        System.out.println("Réaumur : " + re);
        System.out.println("Rankine : " + ra);
        System.out.println("Fahrenheit : " + f);
    }
}
