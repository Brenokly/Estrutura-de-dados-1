import java.util.Scanner;

public class Q23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Entre com o número para cálcular o fatorial: ");
    int n = sc.nextInt();

    sc.close();

    System.out.println("O fatorial de " + n + " é " + fatorial(n));
  }

  private static int fatorial(int n) {
    if (n == 0) {
      return 1;
    }

    return n * fatorial(n - 1);
  }
}
