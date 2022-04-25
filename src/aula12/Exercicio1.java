package aula12;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] nums = new int[3];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Digite: ");
            nums[i] = s.nextInt();
        }

        for (int i = nums.length -1 ; i >= 0; i--) {
            System.out.println(nums[i]);
        }
    }
}
