import java.util.Scanner;

public class Q31 {
  private static class Pessoa {
    String cpf;
    String nome;
    int idade;
    String sexo;
    double peso;
    double altura;
    double imc;

    private Pessoa() {
      this.cpf = "";
      this.nome = "";
      this.idade = 0;
      this.sexo = "";
      this.peso = 0.0;
      this.altura = 0.0;
      this.imc = 0.0;
    }

    public void setNome(String nome) {
      if (nome != null && !nome.isEmpty())
      this.nome = nome;
    }

    public void setPeso(double peso) {
      if (peso > 0)
        this.peso = peso;
    }

    public void setAltura(double altura) {
      if (altura > 0)
        this.altura = altura;
    }

    public void setIdade(int idade) {
      if (idade > 0)
        this.idade = idade;
    }

    public void setSexo(String sexo) {
      if (sexo != null && !sexo.isEmpty())
        this.sexo = sexo;
    }

    public void setCpf(String cpf) {
      if (cpf != null && !cpf.isEmpty())
        this.cpf = cpf;
    }

    public String getNome() {
      return this.nome;
    }

    public double getPeso() {
      return this.peso;
    }

    public double getAltura() {
      return this.altura;
    }

    public int getIdade() {
      return this.idade;
    }

    public String getSexo() {
      return this.sexo;
    }

    public String getCpf() {
      return this.cpf;
    }

    public double getImc() {
      return this.imc;
    }

    public void calculaImc() {
      imc = peso / (altura * altura);
    }

    public void imprimir() {
      System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
      System.out.println("CPF: " + getCpf());
      System.out.println("Nome: " + getNome());
      System.out.println("Idade: " + getIdade());
      System.out.println("Sexo: " + getSexo());
      System.out.println("Peso: " + getPeso());
      System.out.println("Altura: " + getAltura());
      System.out.printf("IMC: %.2f\n", getImc());
      System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    private void leitura() {
      Scanner sc = new Scanner(System.in);
      System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
      System.out.print("Digite o seu CPF: ");
      String cpf = sc.nextLine();
      setCpf(cpf);

      System.out.print("Digite o seu nome: ");
      String nome = sc.nextLine();
      setNome(nome);

      System.out.print("Digite a sua idade: ");
      int idade = sc.nextInt();
      setIdade(idade);

      sc.nextLine(); 
      System.out.print("Digite o seu sexo: ");
      String sexo = sc.nextLine();
      setSexo(sexo);

      System.out.print("Digite o seu peso: ");
      double peso = sc.nextDouble();
      setPeso(peso);

      System.out.print("Digite a sua altura: ");
      double altura = sc.nextDouble();
      setAltura(altura);

      sc.nextLine(); 
      System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    
      calculaImc();
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a quantidade de pessoas: ");
    int qtd = sc.nextInt();

    Pessoa[] pessoas = new Pessoa[qtd];

    for (int i = 0; i < qtd; i++) {
      pessoas[i] = new Pessoa(); 
      pessoas[i].leitura();
    }

    for (int i = 0; i < qtd; i++) {
      pessoas[i].imprimir();
    }

    sc.close();
  }
}
