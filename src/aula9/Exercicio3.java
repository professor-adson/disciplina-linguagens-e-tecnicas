package aula9;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite uma frase contendo a palavra \"java\"");
        String frase = s.nextLine();

        int i = frase.indexOf("java");
        System.out.println("O índice de ocorrência é " + i);
    }
}
