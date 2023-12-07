import java.util.Scanner;

public class Q20 {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);

    // Variáveis
    double investimentoInicial;
    double investimentoMensal;
    int quantidadeMeses;
    double saldoAcumulado = 0;
    double taxaJurosMensal;
    double rendimentoMensal;

    // Entrada de dados
    System.out.print("Informe o investimento inicial: ");
    investimentoInicial = scanner.nextDouble();

    System.out.print("Informe o investimento mensal: ");
    investimentoMensal = scanner.nextDouble();

    System.out.print("Informe a quantidade de meses: ");
    quantidadeMeses = scanner.nextInt();

    System.out.print("Informe a taxa de juros mensal (em decimal): ");
    taxaJurosMensal = scanner.nextDouble();

    saldoAcumulado = investimentoInicial; // Definindo o saldo inicial como o investimento inicial

    for (int i = 1; i <= quantidadeMeses; i++) {
      saldoAcumulado += investimentoMensal; // Adiciona o investimento mensal ao saldo acumulado
      saldoAcumulado *= (1 + taxaJurosMensal); // Aplica a taxa de juros ao saldo acumulado

      // Rendimento mensal é o saldo acumulado menos o investimento inicial
      rendimentoMensal = saldoAcumulado - investimentoInicial;

      // Saída de dados
      System.out.printf("Mês %d - Saldo acumulado: %.2f - Rendimento mensal: %.2f\n", i, saldoAcumulado,
          rendimentoMensal);
    }

    scanner.close();
  }
}
