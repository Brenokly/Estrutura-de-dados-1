import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q34 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite uma frase: ");
    String frase = sc.nextLine();

    String[] palavras = frase.split(" ");
    Map<String, Integer> mapa = new HashMap<>();

    for (int i = 0; i < palavras.length; i++) {
      String palavra = palavras[i];
      if (mapa.containsKey(palavra)) {
        mapa.put(palavra, mapa.get(palavra) + 1);
      } else {
        mapa.put(palavra, 1);
      }
    }

    sc.close();

    System.out.println("Resultado: " + mapa.toString());
  }
}
