import java.util.Scanner;

public class Q17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Escolha o início do intervalo, digite o primeiro número: ");
    int n1 = sc.nextInt();

    System.out.print("Escolha o fim do intervalo, digite o segundo número: ");
    int n2 = sc.nextInt();

    if (n1 > n2) {
      int aux = n1;
      n1 = n2;
      n2 = aux;
    }

    if (n1 % 2 == 0) n1++;

    System.out.println("1 - for\n2 - while\n3 - do while");
    System.out.print("Qual estrutura de repetição você deseja usar? ");
    int op = sc.nextInt();

    sc.close();

    switch (op) {
      case 1:
        for (int i = n1; i <= n2; i+=2) {
          System.out.print(i + " ");
        }
        break;
      case 2:
        while (n1 <= n2) {
          System.out.print(n1 + " ");
          n1+=2;
        }
        break;
      case 3:
        do {
          System.out.print(n1 + " ");
          n1+=2;
        } while (n1 <= n2);
        break;
      default:
        break;
    }
  }
}
