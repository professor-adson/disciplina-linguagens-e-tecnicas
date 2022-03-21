package aula8;

import java.util.Locale;

public class TesteString {
    public static void main(String[] args) {
        String s = "Olá mundo";
        int tamanho = s.length();
        System.out.println(tamanho);

        String s1 = "Olá \n";
        String s2 = "\"mundo";
        System.out.println(s1.toLowerCase(Locale.ROOT) + s2.toUpperCase(Locale.ROOT));

    }
}
