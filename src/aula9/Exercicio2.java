package aula9;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = s.nextLine();

        System.out.println("Digite o sobrenome:");
        String sobreNome = s.nextLine();

        System.out.println(nome.toUpperCase(Locale.ROOT) + " " + sobreNome.toUpperCase(Locale.ROOT));
    }
}
