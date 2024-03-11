import java.util.Scanner;

public class Q10 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Entre com o número: ");
    int n = sc.nextInt();

    sc.close();

    if (n % 2 == 0){
      System.out.println("O número é par");
    } else {
      System.out.println("O número é ímpar");
    }

  }
}
