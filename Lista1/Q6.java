import java.util.Scanner;

public class Q6 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        final double refri = 1.50;
        final double pizza = 3.00;

        System.out.print("Digite a quantidade de refrigerantes: ");
        int qtdRefri = scanner.nextInt();

        System.out.print("Digite a quantidade de fatias pizzas: ");
        int qtdPizza = scanner.nextInt();

        System.out.print("Digite a quantidade de pessoas na mesa: ");
        int qtdPessoas = scanner.nextInt();

        scanner.close();

        double totalSemServico = (qtdRefri * refri) + (qtdPizza * pizza);
        double totalComServico = totalSemServico + totalSemServico * 0.1;

        System.out.println("Total sem serviço: " + totalSemServico);
        System.out.println("Total com serviço: " + totalComServico);
        System.out.println("Rateio por pessoa: " + totalComServico / qtdPessoas);
    }
}