import java.util.Scanner;

public class Q14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Entre com o valor de A: ");
    double a = sc.nextDouble();
    System.out.print("Entre com o valor de B: ");
    double b = sc.nextDouble();
    System.out.print("Entre com o valor de C: ");
    double c = sc.nextDouble();
    double delta = delta(a, b, c);
    System.out.println("Delta: " + delta);

    sc.close();

    if (delta < 0) {
      System.out.println("Não existem raízes reais");
    } else if (delta == 0) {
      double x = -b / 2 * a;
      System.out.println("A raiz é: " + x);
    } else {
      double x1 = (-b + (Math.sqrt(delta))) / (2 * a);
      double x2 = (-b - (Math.sqrt(delta))) / (2 * a);
      System.out.println("As raízes são: " + x1 + " e " + x2);
    }
  }

  public static double delta(double a, double b, double c) {
    return (b * b) - (4 * a * c);
  }
}