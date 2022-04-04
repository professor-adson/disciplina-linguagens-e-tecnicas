package aula10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o valor do salário mínimo:");
        double salarioMinimo = s.nextDouble();

        System.out.println("Digite o valor do salário do usuário:");
        double salario = s.nextDouble();

        double quantidade = salario / salarioMinimo;
        String formatado = new DecimalFormat("0.#").format(quantidade);

        System.out.println("A quantidade de salários mínimos é: " + formatado);

        if (quantidade < 2) {
            System.out.println("Renda baixa");
        } else if (quantidade >= 2 && quantidade < 30) {
            System.out.println("Renda média");
        } else if (quantidade >= 30){
            System.out.println("Renda alta");
        }
    }
}
