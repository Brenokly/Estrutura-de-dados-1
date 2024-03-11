import java.util.Scanner;

public class Q36 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Escolha um número para cálcular o fatorial: ");
    int n = s.nextInt();

    s.close();

    System.out.println("O fatorial de " + n + " é " + fac(n));
  }

  private static int fac(int n) {
    if (n == 1) return 1;

    return n * (fac(n-1));
  }
}
