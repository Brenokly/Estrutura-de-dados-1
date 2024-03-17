package Lista2.Q8;

import Estruturas.Listas.List;
import Exceptions.PilhaVazia;

public class PilhaCrescente <T> implements InterfacePilhaCrescente <T> { // Uma pilha usando um list invertida, onde o topo é o primeiro elemento
  private List<T> pilha;

  public PilhaCrescente() {
    pilha = new List<T>();
  }

  @Override
  public T pop() throws RuntimeException {
    if (isEmpty()) {
      throw new PilhaVazia("A pilha está vázia!");
    }

    T dado = pilha.peekFirst();
    pilha.removeFirst();
    
    return dado;
  }

  @Override
  public void push(T elemento) {
    pilha.addFirst(elemento);
  }

  @Override
  public T peek() {
    if (isEmpty()) {
      return null;
    }

    return pilha.peekFirst();
  }

  @Override
  public boolean isEmpty() {
    return pilha.isEmpty();
  }

  @Override
  public int size() {
    return pilha.size();
  }

  // Método para exibir imprimir a pilha na ordem que foi inserida toString
  public String toString() {
    return pilha.toString();
  }
}