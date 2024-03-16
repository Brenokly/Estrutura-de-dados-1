package Lista2.Q1;

public class Teste {
  public static void main(String[] args) {
    Pilha<Integer> pilha = new Pilha<Integer>(5);

    pilha.push(1);
    pilha.push(2);
    pilha.push(3);
    pilha.push(4);
    pilha.push(5);

    System.out.println("Elemento do topo: " + pilha.peek());

    System.out.println("Saiu: " + pilha.pop());

    System.out.println("Elemento do topo: " + pilha.peek());

    System.out.println("Saiu: " + pilha.pop());

    pilha.push(36);

    System.out.println("Elemento do topo: " + pilha.peek());

    System.out.println("Saiu: " + pilha.pop());
    System.out.println("Saiu: " + pilha.pop());
    System.out.println("Saiu: " + pilha.pop());
    System.out.println("Saiu: " + pilha.pop());
  }
}
