package aula13;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        int[][] n = new int[6][6];

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                n[i][j] = i;
            }
        }

        for (int i = 0; i < n.length; i++) {
            System.out.println(Arrays.toString(n[i]));
        }
    }
}
