package Lista2.Q5;

public interface InterfaceList<E> {
  void addFirst(E e);
  void addLast(E e);

  E peekFirst();
  E peekLast();

  E removeFirst();
  E removeLast();

  boolean isEmpty();
}