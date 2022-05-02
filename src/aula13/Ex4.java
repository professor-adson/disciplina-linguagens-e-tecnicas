package aula13;

import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        int[][] n = new int[6][6];

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
//                if (i % 2 == 0) {
//                    n[i][j] = -1;
//                } else {
//                    n[i][j] = 0;
//                }
                n[i][j] = i % 2 == 0 ? -1 : 0;
            }
        }

        for (int i = 0; i < n.length; i++) {
            System.out.println(Arrays.toString(n[i]));
        }
    }
}
