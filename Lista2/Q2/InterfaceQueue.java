package Lista2.Q2;

public interface InterfaceQueue<T> {
  public void add(T element);

  public T remove();

  public T peek();

  public boolean isEmpty();

  public boolean isFull();
}