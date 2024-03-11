import java.util.Scanner;

class Q22{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o número de inicio do intervalo: ");
    int inicio = sc.nextInt();

    System.out.print("Digite o número de fim do intervalo: ");
    int fim = sc.nextInt();

    if (inicio > fim){
      int aux;
      aux = inicio;
      inicio = fim;
      fim = aux;  
    }

    sc.close();

    int soma = 0;

    for (int i = inicio; i <= fim; i++){
      soma += i;
    }

    System.out.println("A soma dos números do intervalo é: " + soma);
  }
}