import java.util.Arrays;

public class Q29 {
  public static void main(String[] args) {
    int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    System.out.println(Arrays.toString(vetor));

    for (int i = vetor.length - 1; i > 0; i--) {
      int aux = vetor[i];
      vetor[i] = vetor[i - 1];
      vetor[i - 1] = aux;

      System.out.println(Arrays.toString(vetor));
    }
  }
}
