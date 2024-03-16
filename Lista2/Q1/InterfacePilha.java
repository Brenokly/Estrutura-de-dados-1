package Lista2.Q1;

public interface InterfacePilha<T> {
  public T pop();

  public void push(T elemento);

  public T peek();

  public boolean isEmpty();

  public boolean isFull();

  public int size();
}
