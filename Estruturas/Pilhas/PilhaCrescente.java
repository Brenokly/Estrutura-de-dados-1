package Estruturas.Pilhas;

import Estruturas.Lists.List;

public class PilhaCrescente <T> implements InterfacePilhaCrescente <T> { // Uma pilha usando um list invertida, onde o topo é o primeiro elemento
  private List<T> pilha;
  private int size;

  public PilhaCrescente() {
    pilha = new List<T>();
    size = 0;
  }

  @Override
  public T pop() {
    if (isEmpty()) {
      return null;
    }

    T dado = pilha.peekFirst();
    pilha.removeFirst();

    size--;
    
    return dado;
  }

  @Override
  public void push(T elemento) {
    pilha.addFirst(elemento);
    size++;
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
    if (size == 0) {
      return true;
    }

    return false;
  }

  @Override
  public int size() {
    return size;
  }

  // Método para exibir imprimir a pilha na ordem que foi inserida toString
  public String toString() {
    return pilha.toString();
  }
}