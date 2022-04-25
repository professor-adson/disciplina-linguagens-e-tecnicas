package aula12;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("x: ");
        int x = s.nextInt();

        int[] nums = new int[10];
        int maiores = 0;
        int menores = 0;
        int iguais = 0;

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Incluir em nums: ");
            nums[i] = s.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > x) {
                maiores++;
            } else if (nums[i] < x) {
                menores++;
            } else {
                iguais++;
            }
        }

        System.out.println("Maiores: " + maiores);
        System.out.println("Menores: " + menores);
        System.out.println("Iguais: " + iguais);
    }
}
