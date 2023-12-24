import java.util.Scanner;

public class Q24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String menu = "1 - Potenciação\n2 - Raiz Quadrada\n3 - Fatorial\n4 - Sair\n\nEntre com a opção desejada: ";

    int op;

    do {
      System.out.print(menu);
      op = sc.nextInt();
      System.out.println();
      switch (op) {
        case 1:
          System.out.print("Digite a base da potência: ");
          double base = sc.nextDouble();
          System.out.print("Digite o expoente da potência: ");
          double expoente = sc.nextDouble();

          System.out.printf("O resultado da potência é: %.2f", Math.pow(base, expoente));
          break;
        case 2:
          System.out.print("Digite o número para calcular a raiz quadrada: ");
          double numero = sc.nextDouble();

          System.out.printf("O resultado da raiz quadrada é: %.2f", Math.sqrt(numero));
          break;
        case 3:
          System.out.print("Digite o número para calcular o fatorial: ");
          int fatorial = sc.nextInt();

          System.out.println("O resultado do fatorial é: " + fatorial(fatorial));
          break;
        case 4:
          System.out.println("Saindo...");
          break;

        default:
          System.out.println("Opção inválida!");
          break;
      }
      System.out.println("\n----------------------------------\n");
    } while (op != 4 && op > 0 && op < 5);

    sc.close();
  }

  private static int fatorial(int n) {
    if (n == 0) {
      return 1;
    }

    return n * fatorial(n - 1);
  }
}
