import java.util.Scanner;

public class Q7 {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    int a = scanner.nextInt();

    System.out.print("Digite o segundo número: ");
    int b = scanner.nextInt();

    scanner.close();
    
    if (b == 0) {
      System.out.println("Não é possível dividir por zero");
    } else {
      System.out.println("Divisão: " + (a / b));
    }
  }
}
