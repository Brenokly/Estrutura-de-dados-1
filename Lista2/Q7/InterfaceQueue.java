package Lista2.Q7;

public interface InterfaceQueue<T> {
  public void add(T element);

  public T remove();

  public T peek();

  public boolean isEmpty();
}