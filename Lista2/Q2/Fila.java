package Lista2.Q2;

import Exceptions.FilaCheia;
import Exceptions.FilaVazia;

public class Fila<T> implements InterfaceQueue<T> {
  private T[] fila;
  private int sizeMax;
  private int first;
  private int last;

  @SuppressWarnings("unchecked")
  public Fila(int sizeMax) {
    fila = (T[]) new Object[sizeMax];
    this.sizeMax = sizeMax;
    first = last = -1;
  }

  @Override
  public void add(T element) throws RuntimeException {
    if (isFull()) {
      throw new FilaCheia("Queue está cheia!");
    }

    fila[++last] = element;
    if (first == -1) {
      first = 0;
    }
  }

  @Override
  public T remove() throws RuntimeException {
    if (first == -1) {
      throw new FilaVazia("Queue está vázia!");
    }

    T retorno = fila[first];
    if (first == last){
      first = last = -1;
    } else {
      for (int i = 0; i < last; i++) {
        fila[i] = fila[i + 1];
      }
      last--;
    }

    return retorno;
  }

  @Override
  public T peek() throws RuntimeException {
    if (first == -1) {
      throw new FilaVazia("Queue está vázia!");
    }

    return fila[first];
  }

  @Override
  public boolean isEmpty() {
    return first == -1;
  }

  @Override
  public boolean isFull() {
    return (last + 1) == sizeMax;
  }
}
