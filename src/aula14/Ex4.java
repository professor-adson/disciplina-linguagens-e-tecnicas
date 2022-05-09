package aula14;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Linhas:");
    int linhas = s.nextInt();

    System.out.println("Colunas:");
    int colunas = s.nextInt();

    int[][] matriz = new int[linhas][colunas];
    int valor;

    for (int i = 0; i < linhas; i++) {
      for (int j = 0; j < colunas; j++) {
        System.out.println("Valor:");
        valor = s.nextInt();
        if (valor % 2 == 0) {
          matriz[i][j] = 1;
        } else {
          matriz[i][j] = -1;
        }
      }
    }

    for (int i = 0; i < matriz.length; i++) {
      System.out.println(Arrays.toString(matriz[i]));
    }
  }
}
