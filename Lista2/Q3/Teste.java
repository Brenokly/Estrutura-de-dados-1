package Lista2.Q3;

public class Teste {
  public static void main(String[] args) {
    List<Integer> lista = new List<Integer>();

    lista.addFirst(1);
    lista.addFirst(2);
    lista.addFirst(3);
    lista.addFirst(4);
    lista.addLast(5);

    System.out.println("Primeiro elemento: " + lista.peekFirst());

    System.out.println("Saiu: " + lista.removeFirst());

    System.out.println("Primeiro elemento: " + lista.peekFirst());

    System.out.println("Saiu: " + lista.removeFirst());

    System.out.println("Primeiro elemento: " + lista.peekFirst());

    System.out.println("Saiu: " + lista.removeFirst());
    System.out.println("Saiu: " + lista.removeFirst());
    System.out.println("Saiu: " + lista.removeFirst());
    System.out.println(lista.isEmpty());
  }
}
