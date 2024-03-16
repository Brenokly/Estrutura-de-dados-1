package Lista2.Q2;

public class Teste {
  public static void main(String[] args) {
    Fila<Integer> fila = new Fila<Integer>(5);

    fila.add(1);
    fila.add(2);
    fila.add(3);
    fila.add(4);
    fila.add(5);

    System.out.println("Elemento do início: " + fila.peek());

    System.out.println("Saiu: " + fila.remove());

    System.out.println("Elemento do início: " + fila.peek());

    System.out.println("Saiu: " + fila.remove());

    System.out.println("Elemento do início: " + fila.peek());

    System.out.println("Saiu: " + fila.remove());
    System.out.println("Saiu: " + fila.remove());
    System.out.println("Saiu: " + fila.remove());
  }
}
