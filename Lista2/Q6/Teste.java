package Lista2.Q6;

public class Teste {
  public static void main(String[] args) {
    Pilha<String> pilha = new Pilha<String>();

    // Elemento adicionado ao topo

    pilha.push("Breno");

    System.out.println("Atual elemento do topo: " + pilha.peek());

    // Adicionando outro elemento, que agora deve ir para o topo.

    pilha.push("Eric");

    System.out.println("Novo elemento do topo: " + pilha.peek());

    // removendo o último elemento adicionado

    System.out.println("Removendo elemento do topo: " + pilha.pop());

    // O antigo elemento do topo volta a estar no topo.

    System.out.println("Antigo volta a estar no topo: " + pilha.peek());
  }
}
