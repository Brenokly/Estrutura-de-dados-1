public class Q38 {

  private static void exibirOjeto(Object o) {
    if (o != null){
      System.out.println(o.toString());
    } else {
      System.out.println("O objeto é nulo!");
    }
  }

  private static <T> void exibirVetor(T[] v) {
    if (v != null && v.length > 0) {
      //System.out.println("O vetor é: " + java.util.Arrays.toString(v));
      System.out.print("O vetor é: [");
      for (int i = 0; i < v.length; i++) {
        System.out.print(v[i]);
        if (i < v.length - 1) {
          System.out.print(", ");
        }
      }
      System.out.println("]");
    } else {
      System.out.println("O vetor é nulo ou vazio!");
    }
  }
  public static void main(String[] args) {
    String s = "Hello World!";
    Double[] v = {1.5, 5.6, 6.4, 5.6, 7.8, 9.0};

    exibirOjeto(s);

    exibirVetor(v);
  }
}
