package aula13;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        double[][] n = new double[5][10];

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                n[i][j] = Math.pow(j, 2);
//                n[i][j] = j*j;
            }
        }

        for (int i = 0; i < n.length; i++) {
            System.out.println(Arrays.toString(n[i]));
        }
    }
}
