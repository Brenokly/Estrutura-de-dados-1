package Estruturas.Pilhas;

public interface InterfacePilha<T> {
  public T pop();

  public void push(T elemento);

  public T peek();

  public boolean isEmpty();

  public boolean isFull();

  public int size();
}
