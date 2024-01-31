import java.util.Scanner;

public class Q37 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Escolha o primeiro número de um intervalo: ");
    int a = s.nextInt();

    System.out.print("Escolha o segundo número de um intervalo: ");
    int b = s.nextInt();

    s.close();

    if (a > b) {
      int aux = a;
      a = b;
      b = aux;
    }

    System.out.println("O somatório dos números com recurssividade no intervalo [" + a + ", " + b + "] é " + sum(a, b));
    System.out.println("O somatório dos números com estrutura de repetição no intervalo [" + a + ", " + b + "] é " + sum2(a, b));

    // O problema resolvido com recurssividade é mais simples e elegante, porém é mais complexo.
    // o problema resolvido com estrutura de repetição é mais simples e menos complexo, porém é mais verboso e menos elegante.
  }

  private static int sum(int a, int b) {
    if (a == b) return a;

    return a + sum(a+1, b);
  }

  private static int sum2(int a, int b) {
    int sum = 0;

    for (int i = a; i <= b; i++) {
      sum += i;
    }

    return sum;
  }
}
