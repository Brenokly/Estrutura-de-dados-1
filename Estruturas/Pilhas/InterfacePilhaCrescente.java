package Estruturas.Pilhas;

public interface InterfacePilhaCrescente<T> {
  public T pop();

  public void push(T elemento);

  public T peek();

  public boolean isEmpty();

  public int size();
}
