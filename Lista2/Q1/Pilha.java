package Lista2.Q1;

public class Pilha<T> implements InterfacePilha<T> {
  private T[] pilha;
  private int topo;
  private int size;

  @SuppressWarnings("unchecked")
  public Pilha(int capacidade) {
    pilha = (T[]) new Object[capacidade];
    topo = -1;
    size = capacidade;
  }

  @Override
  public T pop() {
    if (isEmpty()) {
      return null;
    }

    T dado = pilha[topo];
    pilha[topo] = null;

    topo--;

    return dado;
  }

  @Override
  public void push(T elemento) throws RuntimeException {
    if (isFull()) {
      throw new RuntimeException("Pilha cheia");
    }

    pilha[++topo] = elemento;
  }

  @Override
  public T peek() {
    if (isEmpty()) {
      return null;
    }

    return pilha[topo];
  }

  @Override
  public boolean isEmpty() {
    if (topo == -1) {
      return true;
    }

    return false;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isFull() {
    if (topo == pilha.length-1) {
      return true;
    }

    return false;
  }

  // Método para exibir imprimir a pilha na ordem que foi inserida toString
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (var each : pilha) {
      if (each != null) {
        sb.append(each + ",");
      }
    }

    if (sb.length() == 0) {
      return "[]";
    }

    return "[" + sb.toString() + "\b]";
  }
}
