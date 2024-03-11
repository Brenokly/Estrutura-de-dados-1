import java.util.Scanner;

public class Q30 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite uma frase: ");
    String frase = input.nextLine();

    input.close();

    System.out.println("A frase invetida é: " + inverter(frase));
  }

  public static String inverter(String frase) {
    String invertida = "";

    System.out.println(frase.length());

    for (int i = frase.length() - 1; i >= 0; i--){
      invertida += frase.charAt(i);
    }
    return invertida;
  }
}
