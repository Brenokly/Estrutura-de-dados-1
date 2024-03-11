import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q33 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite uma palavra: ");
    String palavra = sc.nextLine();

    Map<Character, Integer> mapa = new HashMap<>();

    for (int i = 0; i < palavra.length(); i++) {
      char letra = palavra.charAt(i);
      if (mapa.containsKey(letra)) {
        mapa.put(letra, mapa.get(letra) + 1);
      } else {
        mapa.put(letra, 1);
      }
    }

    sc.close();

    System.out.println("Resultado: " + mapa.toString());
  }
}
