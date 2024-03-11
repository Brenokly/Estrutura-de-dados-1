import java.util.Scanner;

public class Q9 {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);

    double raio = 0.0;

    do {
      System.out.print("Digite o raio do círculo: ");
      raio = scanner.nextDouble();

    } while (raio < 0);

    scanner.close();

    System.out.printf("Área do círculo: %.2f\n", (Math.PI * (raio * raio)));
  }
}
