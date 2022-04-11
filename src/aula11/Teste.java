package aula11;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite os anos");
        int anos = s.nextInt();

        System.out.println("Digite os meses");
        int meses = s.nextInt();

        System.out.println("Digite os dias");
        int dias = s.nextInt();

        int z = transformaAnosEmDias(anos);
        int w = transformaMesesEmDias(meses);

        int total = z + w + dias;
        double raiz = Math.sqrt(total);
        String r = new DecimalFormat("0.##").format(raiz);

        System.out.println(total + ": " + r);
    }

    static int transformaAnosEmDias(int x) {
        return x * 365;
    }

    static int transformaMesesEmDias(int y) {
        return y * 30;
    }
}
