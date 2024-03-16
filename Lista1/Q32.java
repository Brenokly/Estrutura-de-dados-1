import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q32 {

  private static class Pessoa implements Serializable {
    String cpf;
    String nome;
    int idade;
    String sexo;
    double peso;
    double altura;
    double imc;

    public Pessoa(String cpf, String nome, int idade, String sexo, double peso, double altura) {
      this.cpf = cpf;
      this.nome = nome;
      this.idade = idade;
      this.sexo = sexo;
      this.peso = peso;
      this.altura = altura;
      calculaImc();
    }

    private void calculaImc() {
      imc = peso / (altura * altura);
    }

    public void imprimir() {
      System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
      System.out.println("CPF: " + cpf);
      System.out.println("Nome: " + nome);
      System.out.println("Idade: " + idade);
      System.out.println("Sexo: " + sexo);
      System.out.println("Peso: " + peso);
      System.out.println("Altura: " + altura);
      System.out.printf("IMC: %.2f\n", imc);
      System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
  }

  private static final String CAMINHO_ARQUIVO = "D:\\Brwno\\OneDrive\\Área de Trabalho\\Meus Arquivos\\Materiais da Faculdade\\P4\\Data Structure 1\\Lista1\\Estrutura-de-dados-1\\cadastro.bin";

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a quantidade de pessoas: ");
    int qtd = sc.nextInt();

    List<Pessoa> pessoas = new ArrayList<>();

    for (int i = 0; i < qtd; i++) {
      sc.nextLine(); // Consumir a quebra de linha pendente
      System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
      System.out.print("Digite o CPF da pessoa " + (i + 1) + ": ");
      String cpf = sc.nextLine();

      System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
      String nome = sc.nextLine();

      System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
      int idade = sc.nextInt();

      sc.nextLine(); // Consumir a quebra de linha pendente
      System.out.print("Digite o sexo da pessoa " + (i + 1) + ": ");
      String sexo = sc.nextLine();

      System.out.print("Digite o peso da pessoa " + (i + 1) + ": ");
      double peso = sc.nextDouble();

      System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
      double altura = sc.nextDouble();

      Pessoa pessoa = new Pessoa(cpf, nome, idade, sexo, peso, altura);
      pessoas.add(pessoa);
    }

    // Salvar no arquivo binário
    salvarNoArquivoBinario(pessoas);

    // Exibir conteúdo do arquivo binário
    exibirConteudoDoArquivoBinario();

    sc.close();
  }

  private static void salvarNoArquivoBinario(List<Pessoa> pessoas) {
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(CAMINHO_ARQUIVO))) {
      oos.writeObject(pessoas);
      System.out.println("Dados salvos no arquivo binário.");
    } catch (IOException e) {
      System.out.println("Erro ao salvar no arquivo binário: " + e.getMessage());
    }
  }

  private static void exibirConteudoDoArquivoBinario() {
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(CAMINHO_ARQUIVO))) {
      @SuppressWarnings("unchecked")
      List<Pessoa> pessoasLidas = (List<Pessoa>) ois.readObject();

      System.out.println("Lista de Pessoas Lidas do Arquivo Binário:");
      for (Pessoa pessoa : pessoasLidas) {
        pessoa.imprimir();
      }
    } catch (IOException | ClassNotFoundException e) {
      System.out.println("Erro ao ler o arquivo binário: " + e.getMessage());
    }
  }
}
