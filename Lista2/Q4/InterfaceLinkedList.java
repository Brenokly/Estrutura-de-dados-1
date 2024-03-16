package Lista2.Q4;

import java.util.List;

public interface InterfaceLinkedList<E> extends List<E> {
  void addFirst(E e);
  void addLast(E e);

  E peekFirst();
  E peekLast();

  E removeFirst();
  E removeLast();

  boolean isEmpty();
}