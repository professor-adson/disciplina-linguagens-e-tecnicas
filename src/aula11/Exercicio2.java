package aula11;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a temperatura em ºC:");
        double c = s.nextDouble();

        double f = c2f(c);
        double k = c2k(c);
        double re = c2re(c);
        double ra = c2ra(c);

        System.out.println("Kelvin: " + k + "\n");
        System.out.println("Réaumur : " + re);
        System.out.println("Rankine : " + ra);
        System.out.println("Fahrenheit : " + f);
    }

    static double c2f(double x) {
        return x * 1.8 + 32;
    }

    static double c2k(double x) {
        return x + 273.15;
    }

    static double c2re(double x) {
        return x * 0.8;
    }

    static double c2ra(double x) {
        return x * 1.8 + 32 + 459.67;
    }
}
