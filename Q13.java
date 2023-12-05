public class Q13 {
  public static void main(String[] args) {
    double nota1 = 7.0;
    double nota2 = 7.0;
    double nota3 = 7.0;
    double media = (nota1 + nota2 + nota3) / 3;
    if (media >= 7.0) {
      System.out.println("Aprovado");
    } else if (media >= 4.0) {
      System.out.println("Final");
      // quanto ele precisa tirar na 4 prova para passar? A média deve ser maior ou igual a 5
      double nota4 = ((50) - (media * 6)/4);
      System.out.println("Nota necessária na prova final: " + nota4);
    } else {
      System.out.println("Reprovado");
    }

  }
}
