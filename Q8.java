import java.util.Scanner;

public class Q8 {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite seu peso: ");
    double peso = scanner.nextDouble();

    System.out.print("Digite sua altura: ");
    double altura = scanner.nextDouble();

    scanner.close();

    if (altura == 0) {
      System.out.println("Não é possível dividir por zero");
    } else {
      System.out.printf("IMC: %.2f\n", (peso / (altura * altura)));
    }
  }
}
