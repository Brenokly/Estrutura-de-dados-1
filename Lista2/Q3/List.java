package Lista2.Q3;

public class List<T> implements InterfaceList<T> {

  class Node {
    T data;
    Node next;

    public Node(T data) {
      this.data = data;
      this.next = null;
    }
  }

  private Node head;
  private Node tail;
  private int size;

  public List() {
    head = null;
    tail = null;
    size = 0;
  }

  @Override
  public void addFirst(T e) {
    if (size == 0) {
      head = new Node(e);
      tail = head;
      size++;
    } else {
      Node newNode = new Node(e);
      newNode.next = head;
      head = newNode;
      size++;
    }
  }

  @Override
  public void addLast(T e) {
    if (size == 0) {
      head = new Node(e);
      tail = head;
      size++;
    } else {
      Node newNode = new Node(e);
      tail.next = newNode;
      tail = newNode;
      size++;
    }
  }

  @Override
  public T peekFirst() {
    return head.data;
  }

  @Override
  public T peekLast() {
    return tail.data;
  }

  @Override
  public T removeFirst() {
    Node aux = head;
    head = aux.next;
    aux.next = null;
    size--;

    return aux.data;
  }

  @Override
  public T removeLast() {
    Node aux = head;
    while (aux.next != tail) {
      aux = aux.next;
    }
    tail = aux;
    aux = aux.next;
    tail.next = null;
    size--;

    return aux.data;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  // Método para exibir imprimir a pilha na ordem que foi inserida toString
  public String toString() {
    if (isEmpty()) {
      return "[]";
    }

    StringBuilder str = new StringBuilder();
    Node aux = head;
    while (aux != null) {
      str.append(aux.data + ", ");
      aux = aux.next;
    }
    return "[" + str + "\b\b]";
  }

  @Override
  public int size() {
    return size;
  }
}