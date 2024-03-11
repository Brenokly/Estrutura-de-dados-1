import java.util.Scanner;

public class Q11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int conta1 = 100;
    int conta2 = 100;

    // exibir a conta1 e conta2
    System.out.println("Saldo da Conta 1: " + conta1);
    System.out.println("Saldo da Conta 2: " + conta2);

    System.out.print("Quanto deve ser transferido da conta 1 para a conta 2? ");
    int valor = sc.nextInt();

    sc.close();

    if (valor > conta1){
      System.out.println("Não é possível transferir este valor, saldo insuficiente!");
    } else {
      conta1 = conta1 - valor;
      conta2 = conta2 + valor;
      System.out.println("Transferência realizada com sucesso!");
      System.out.println("Saldo da Conta 1: " + conta1);
      System.out.println("Saldo da Conta 2: " + conta2);
    
    }
  }
}
