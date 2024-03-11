import java.util.Scanner;

public class Q18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String senha = "123456";

    System.out.println("1 - while\n2 - do while");
    System.out.print("Escolha qual estrutura de repetição você deseja usar: ");
    int op = sc.nextInt();

    switch (op) {
      case 1:
        while (true) {
          System.out.print("Digite a senha: ");
          senha = sc.nextLine();
          if (senha.equals("123456")) {
            System.out.println("Senha correta!");
            break;
          }
        }

        break;
      case 2:
        do {
          System.out.print("Digite a senha: ");
          senha = sc.nextLine();
          if (senha.equals("123456")) {
            System.out.println("Senha correta!");
            break;
          }
        } while (true);
        break;
      default:
        break;
    }

    sc.close();
  }
}
