public class Q28 {
  public static void main(String[] args) {
    int[] vetor = {33, 27, 40, 6, 99};

    int maior = vetor[0];
    int menor = vetor[0];
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] > maior) {
        maior = vetor[i];
      }

      if (vetor[i] < menor) {
        menor = vetor[i];
      }
    }

    System.out.println("O maior número do vetor é: "+ maior);
    System.out.println("O menor número do vetor é: " + menor);
    
  }
}
