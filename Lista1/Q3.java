import java.util.Scanner;

public class Q3 {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o primeiro número: ");
    int a = scanner.nextInt();
    System.out.print("Digite o segundo número: ");
    int b = scanner.nextInt();
    scanner.close();
    System.out.println("Soma: " + (a + b));
    System.out.println("Subtração: " + (a - b));
    System.out.println("Multiplicação: " + (a * b));
    System.out.println("Divisão: " + (a / b));
    System.out.println("Resto: " + (a % b));
  }
}
