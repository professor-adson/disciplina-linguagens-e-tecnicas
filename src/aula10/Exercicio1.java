package aula10;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome");
        String nome = s.nextLine();

        System.out.println("Digite o sexo (F ou M)");
        String sexo = s.nextLine();

        System.out.println("Digite o idade");
        int idade = s.nextInt();

        String genero = "homem";
        if (sexo.equals("F")) {
            genero = "mulher";
        }

        String situacao = "menor";
        if (idade >= 18) {
            situacao = "maior";
        }

        System.out.println("Olá \"" + nome + "\"" +
                "você é " + genero +
                ", e tem " +
                idade + " anos, então é " +
                situacao + " de idade.");
    }
}
