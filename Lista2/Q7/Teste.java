package Lista2.Q7;

public class Teste {
  public static void main(String[] args) {
    Fila<String> fila = new Fila<String>(); // fila do pão

    // Adicionando o priemeiro elemento a fila, que é o primeiro e último ao mesmo tempo.

    fila.add("Breno");
    System.out.println("Chegou clienteeee! " + fila.peek());
    // Chega outra pessoa na fila do pão (último da fila)

    fila.add("Eric");
    
    // chega outra pessoa a fila do pão (Novo último da fila)

    fila.add("Bruno");

    // A primeira pessoa e atendida e sai da fila

    System.out.println(fila.remove() + " Foi atendido e saiu da fila.");

    System.out.println("Próximo a ser atendido: " + fila.peek());

    System.out.println(fila.remove() + " Foi atendido e saiu da fila.");

    System.out.println("A fila ainda tem gente? " + !fila.isEmpty());

    System.out.println("Próximo a ser atendido: " + fila.peek());

    System.out.println(fila.remove() + " Foi atendido e saiu da fila.");

    System.out.println("A fila ainda tem gente? " + !fila.isEmpty());

    System.out.println("Uffa, atendemos todo mundo, vamos tirar férias!!");
  }
}
