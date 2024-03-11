import java.util.Scanner;

public class Q25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o tamanho do vetor: ");
    int tamanho = sc.nextInt();

    int[] vetor = new int[tamanho];

    for (int i = 0; i < vetor.length; i++) {
      System.out.printf("Digite o %dº número: ", i + 1);
      vetor[i] = sc.nextInt();
    }

    sc.close();

    System.out.println("\n----------------------------------\n");

    for (int i = 0; i < vetor.length; i++) {
      System.out.printf("O %dº número é: %d\n", i + 1, vetor[i]);
    }
  }
}
