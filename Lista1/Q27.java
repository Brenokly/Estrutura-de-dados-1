public class Q27 {
  public static void main(String[] args) {
    //Construa e use uma função que produz um novo vetor de inteiros com a ordem inversa do vetor original passado por parâmetro.
    int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    System.out.println("Ordem atual do vetor: ");
    for (int i = 0; i < vetor.length; i++) {
      System.out.printf("%d ", vetor[i]);
    }

    System.out.println("\n----------------------------------\n");

    int[] vetorInvertido = inverterVetor(vetor);
    System.out.println("Ordem inversa do vetor: ");
    for (int i = 0; i < vetorInvertido.length; i++) {
      System.out.printf("%d ", vetorInvertido[i]);
    }
  }

  private static int[] inverterVetor(int[] vetor) {
    int[] vetorInvertido = new int[vetor.length];

    for (int i = 0; i < vetor.length; i++) {
      vetorInvertido[i] = vetor[vetor.length - i - 1];
    }

    return vetorInvertido;
  }
}
