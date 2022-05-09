package aula14;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Linhas:");
    int linhas = s.nextInt();

    System.out.println("Colunas:");
    int colunas = s.nextInt();

    System.out.println("Linha:");
    int linha = s.nextInt();

    int[][] matriz = new int[linhas][colunas];
    int valor;
    double soma = 0;

    for (int i = 0; i < linhas; i++) {
      for (int j = 0; j < colunas; j++) {
        System.out.println("Valor:");
        valor = s.nextInt();
        matriz[i][j] = valor;
        if (i == linha) {
          soma += valor;
        }
      }
    }

    for (int i = 0; i < matriz.length; i++) {
      System.out.println(Arrays.toString(matriz[i]));
    }
    double media = (double) soma/colunas;
    System.out.println("Média: " + new DecimalFormat("#0.00").format(media));
  }
}
