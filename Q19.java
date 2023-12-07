import java.util.Scanner;

public class Q19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número para fazermos a tabuada: ");
    int n = sc.nextInt();

    sc.close();

    for (int i = 1; i < 10; i++) {
      System.out.println(i + " x " + n + " = " + (i * n));
    }
  }
}
