package Estruturas;

import java.util.List;

public interface MyLinkedList<E> extends List<E> {
  void addFirst(E e);
  void addLast(E e);

  E peekFirst();
  E peekLast();

  E removeFirst();
  E removeLast();
}