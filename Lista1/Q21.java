public class Q21 {

  public static boolean ehPrimo(int numero) {
    if (numero <= 1) {
      return false;
    }

    if (numero <= 3) {
      return true;
    }

    if (numero % 2 == 0 || numero % 3 == 0) {
      return false;
    }

    int sqrt = (int) Math.sqrt(numero) + 1;

    for (int i = 5; i <= sqrt; i += 6) {
      if (numero % i == 0 || numero % (i + 2) == 0) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    int numero = 10; // Altere o número conforme necessário

    if (ehPrimo(numero)) {
      System.out.println(numero + " é primo.");
    } else {
      System.out.println(numero + " não é primo.");
    }
  }
}
