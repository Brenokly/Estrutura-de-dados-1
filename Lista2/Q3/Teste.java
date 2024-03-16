package Lista2.Q3;

public class Teste {
  public static void main(String[] args) {
    List<Integer> lista = new List<Integer>();

    lista.addLast(1);
    lista.addLast(2);
    lista.addLast(3);
    lista.addLast(4);
    lista.addLast(5);

    System.out.println("Primeiro elemento: " + lista.peekFirst());

    System.out.println("Saiu: " + lista.removeFirst());

    System.out.println("Primeiro elemento: " + lista.peekFirst());

    System.out.println("Saiu: " + lista.removeFirst());

    System.out.println("Primeiro elemento: " + lista.peekFirst());

    System.out.println("Saiu: " + lista.removeFirst());
    System.out.println("Saiu: " + lista.removeFirst());
    System.out.println("Saiu: " + lista.removeFirst());
    System.out.println("Está vázia? " + lista.isEmpty());
  }
}
