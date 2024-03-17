package Lista2.Q9;

import java.util.Scanner;
import Lista2.Q7.Fila; // usando a fila implementada na questão Q7

public class distancebetweencities {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantas cidades serão? ");
    int cidades = sc.nextInt();

    int[] vetorResultado = new int[cidades];

    System.out.println("Digite o número da cidade inicial!");
    System.err.println("Você pode escolher entre " + 0 + " até " + (cidades - 1));
    System.err.print("Cidade inicial: ");
    int cidadeInicial = sc.nextInt();

    for (int i = 0; i < cidades; i++) {
      if (i != cidadeInicial) {
        vetorResultado[i] = -1;
      }
    }

    Fila<Integer> fila = new Fila<>();
    int[][] matriz = new int[cidades][cidades];

    System.out.println("Digite a distância entre cada cidade!");
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        if (i != j) {
          System.out.print("Digite a distância entre a cidade " + i + " para a cidade " + j + ": ");
          matriz[i][j] = sc.nextInt();
        } else {
          matriz[i][j] = 0;
        }
      }
    }

    System.out.println("=============================");
    System.out.println("Matriz:");
    for (int i = 0; i < cidades; i++) {
      for (int j = 0; j < cidades; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println('\n');
    }

    fila.add(cidadeInicial);

    while (!fila.isEmpty()) {
      int cidadeAtual = fila.remove();

      for (int i = 0; i < cidades; i++) {
        int distancia = matriz[cidadeAtual][i];

        if (distancia > 0 && vetorResultado[i] == -1) {
          vetorResultado[i] = vetorResultado[cidadeAtual] + distancia;
          fila.add(i);
        }
      }
    }

    System.out.println("=============================");
    System.out.println("VetorResultado: ");
    for (int i = 0; i < vetorResultado.length; i++) {
      System.out.println((i + 1) + ": " + vetorResultado[i]);
    }

    sc.close();
  }
}
