package Lista2.Q7;

import Lista2.Q4.LinkedList;

public class Fila<T> implements InterfaceQueue<T> {
  LinkedList<T> fila;

  public Fila(){
    fila = new LinkedList<T>();
  }

  @Override
  public void add(T element) {
    fila.addLast(element);
  }

  @Override
  public T remove() {
    T element = fila.peekFirst();

    fila.removeFirst();

    return element;
  }

  @Override
  public T peek() {
    return fila.peekFirst();
  }

  @Override
  public boolean isEmpty() {
    return fila.isEmpty();
  }
}
