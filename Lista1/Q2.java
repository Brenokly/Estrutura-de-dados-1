import java.util.Scanner;

public class Q2 {
  public static void main(String args[]) {
      int idade;
      double altura;
      char primeiraLetra;
      String nomeCompleto;
      try (Scanner sc = new Scanner(System.in)) {
          System.out.print("Digite sua idade: ");
          idade = sc.nextInt();
          System.out.print("Digite sua altura: ");
          altura = sc.nextDouble();
          System.out.print("Digite a primeira letra do seu nome: ");
          primeiraLetra = sc.next().charAt(0);
          sc.nextLine();
          System.out.print("Digite seu nome completo: ");
          nomeCompleto = sc.nextLine();
      }

    System.out.println("Idade: " + idade);
    System.out.println("Altura: " + altura);
    System.out.println("Primeira letra do seu nome: " + primeiraLetra);
    System.out.println("Nome completo: " + nomeCompleto);
  }
}
