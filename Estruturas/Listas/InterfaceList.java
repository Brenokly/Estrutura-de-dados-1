package Estruturas.Listas;

public interface InterfaceList<E> {
  void addFirst(E e);
  void addLast(E e);

  E peekFirst();
  E peekLast();

  E removeFirst();
  E removeLast();

  boolean isEmpty();
}