package Lista2.Q6;

import Exceptions.PilhaVazia;
import Lista2.Q3.List;

public class Pilha <T> implements InterfacePilhaCrescente<T> {
  private List<T> pilha;

  public Pilha(){
    this.pilha = new List<T>();
  }

  @Override
  public T pop() {
    T element = pilha.peekFirst();

    pilha.removeFirst();

    return element;
  }

  @Override
  public void push(T elemento) {
    pilha.addFirst(elemento);
  }

  @Override
  public T peek() throws RuntimeException {
    if (pilha.isEmpty()){
      throw new PilhaVazia("Pilha está vázia");
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