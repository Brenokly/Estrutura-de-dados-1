package Lista2.Q4;

public class Teste {
  public static void main(String[] args) {
    LinkedList<Integer> lista = new LinkedList<Integer>();

    lista.add(1);
    lista.add(2);
    lista.addFirst(3);
    lista.addLast(4);
    lista.addLast(5);

    System.out.println("Elemento do início: " + lista.peekFirst());

    System.out.println("Saiu: " + lista.removeFirst());

    System.out.println("Elemento do início: " + lista.peekFirst());

    System.out.println("Saiu: " + lista.removeFirst());

    System.out.println("Elemento do início: " + lista.peekFirst());

    System.out.println("Elemento do fim: " + lista.peekLast());
    System.out.println("Saiu o último: " + lista.removeLast());

    System.out.println("Saiu: " + lista.removeFirst());
    
    System.out.println("Saiu: " + lista.removeFirst());

    System.out.println("Está vázia? " + lista.isEmpty());
  }
}
