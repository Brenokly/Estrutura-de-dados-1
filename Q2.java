import java.util.Scanner;

public class Q2 {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite sua idade: ");
    int idade = scanner.nextInt();

    System.out.print("Digite sua altura: ");
    double altura = scanner.nextDouble();

    System.out.print("Digite a primeira letra do seu nome: ");
    char primeiraLetra = scanner.next().charAt(0);

    scanner.nextLine();

    System.out.print("Digite seu nome completo: ");
    String nomeCompleto = scanner.nextLine();

    scanner.close();

    System.out.println("Idade: " + idade);
    System.out.println("Altura: " + altura);
    System.out.println("Primeira letra do seu nome: " + primeiraLetra);
    System.out.println("Nome completo: " + nomeCompleto);
  }
}
