import java.util.Scanner;

public class Q26 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o tamanho da matriz: \nLinhas:");
    int linhas = sc.nextInt();
    System.out.print("Colunas: ");
    int colunas = sc.nextInt();

    int[][] matriz = new int[linhas][colunas];

    for (int i = 0; i < linhas; i++) {
      for (int j = 0; j < colunas; j++) {
        System.out.printf("Digite o valor da posição [%d][%d]: ", i, j);
        matriz[i][j] = sc.nextInt();
      }
    }

    System.out.println("\n----------------------------------\n");

    for (int i = 0; i < linhas; i++) {
      for (int j = 0; j < colunas; j++) {
        System.out.printf("O valor da posição [%d][%d] é: %d\n", i, j, matriz[i][j]);
      }
    }

    sc.close();
  }
}
