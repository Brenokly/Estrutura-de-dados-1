package Lista2.Q4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<E> implements InterfaceLinkedList<E> {
  private Node head;
  private Node tail;
  private int size;

  class Node {
    E data;
    Node next;
    Node prev;

    Node(E data) {
      this.data = data;
      this.next = null;
      this.prev = null;
    }
  }

  public LinkedList() {
    head = null;
    tail = null;
    size = 0;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public boolean contains(Object o) {
    Node aux = head;
    while (aux != null) {
      if (aux.data.equals(o)) {
        return true;
      }
      aux = aux.next;
    }
    return false;
  }

  @Override
  public Iterator<E> iterator() {
    return new Iterator<E>() {
      Node aux = head;

      @Override
      public boolean hasNext() {
        return aux != null;
      }

      @Override
      public E next() {
        E data = aux.data;
        aux = aux.next;
        return data;
      }
    };
  }

  @Override
  public Object[] toArray() {
    Object[] arr = new Object[size];
    Node aux = head;
    for (int i = 0; i < size; i++) {
      arr[i] = aux.data;
      aux = aux.next;
    }
    return arr;
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T[] toArray(T[] a) {
    if (a.length < size) {
      a = (T[]) new Object[size];
    }
    Node aux = head;
    for (int i = 0; i < size; i++) {
      a[i] = (T) aux.data;
      aux = aux.next;
    }
    return a;
  }

  @Override
  public boolean add(E e) {
    Node newNode = new Node(e);
    if (head == null) { // isEmpity() poderia ser usado aqui
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    }
    size++;
    return true;
  }

  @Override
  public boolean remove(Object o) {
    Node aux = head;
    while (aux != null) {
      if (aux.data.equals(o)) {
        if (aux.prev != null) {
          aux.prev.next = aux.next;
        } else {
          head = aux.next;
        }
        if (aux.next != null) {
          aux.next.prev = aux.prev;
        } else {
          tail = aux.prev;
        }
        size--;
        // é importante que o nó seja removido da memória
        aux.next = null;
        aux.prev = null;

        return true;
      }
      aux = aux.next;
    }
    return false;
  }

  @Override
  public boolean containsAll(Collection<?> c) {
    for (Object o : c) {
      if (!contains(o)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public boolean addAll(Collection<? extends E> c) {
    // e se a lista estiver vazia?
    if (c.isEmpty()) {
      return false;
    }

    for (E e : c) {
      add(e);
      size++;
    }

    return true;
  }

  @Override
  public boolean addAll(int index, Collection<? extends E> c) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("Index out of bounds");
    }
    if (index == size) {
      return addAll(c);
    }
    Node aux = head;
    for (int i = 0; i < index; i++) {
      aux = aux.next;
    }
    for (E e : c) {
      Node newNode = new Node(e);
      newNode.next = aux;
      newNode.prev = aux.prev;
      aux.prev.next = newNode;
      aux.prev = newNode;
      size++;
    }
    return true;
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    boolean modified = false;
    for (Object o : c) {
      modified |= remove(o);
    }
    return modified;
  }

  @Override
  public boolean retainAll(Collection<?> c) {
    boolean modified = false;
    Node aux = head;
    while (aux != null) {
      if (!c.contains(aux.data)) {
        remove(aux.data);
        modified = true;
      }
      aux = aux.next;
    }
    return modified;
  }

  @Override
  public void clear() {
    Node aux = head;
    while (aux != null) {
      Node next = aux.next;
      aux.next = null;
      aux.prev = null;
      aux = next;
    }
    head = null;
    tail = null;
    size = 0;
  }

  @Override
  public E get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index out of bounds");
    }
    Node aux = head;
    for (int i = 0; i < index; i++) {
      aux = aux.next;
    }
    return aux.data;
  }

  @Override
  public E set(int index, E element) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index out of bounds");
    }
    Node aux = head;
    for (int i = 0; i < index; i++) {
      aux = aux.next;
    }
    E oldData = aux.data;
    aux.data = element;
    return oldData;
  }

  @Override
  public void add(int index, E element) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("Index out of bounds");
    }
    if (index == size) {
      add(element);
      return;
    }
    Node newNode = new Node(element);
    if (index == 0) {
      newNode.next = head;
      head.prev = newNode;
      head = newNode;
    } else {
      Node aux = head;
      for (int i = 0; i < index; i++) {
        aux = aux.next;
      }
      newNode.next = aux;
      newNode.prev = aux.prev;
      aux.prev.next = newNode;
      aux.prev = newNode;
    }
    size++;
  }

  @Override
  public E remove(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index out of bounds");
    }
    Node aux = head;
    for (int i = 0; i < index; i++) {
      aux = aux.next;
    }
    if (aux.prev != null) {
      aux.prev.next = aux.next;
    } else {
      head = aux.next;
    }
    if (aux.next != null) {
      aux.next.prev = aux.prev;
    } else {
      tail = aux.prev;
    }
    size--;
    E data = aux.data;
    aux.next = null;
    aux.prev = null;
    return data;
  }

  @Override
  public int indexOf(Object o) {
    Node aux = head;
    for (int i = 0; i < size; i++) {
      if (aux.data.equals(o)) {
        return i;
      }
      aux = aux.next;
    }
    return -1;
  }

  @Override
  public int lastIndexOf(Object o) {
    Node aux = tail;
    for (int i = size - 1; i >= 0; i--) {
      if (aux.data.equals(o)) {
        return i;
      }
      aux = aux.prev;
    }
    return -1;
  }

  @Override
  public ListIterator<E> listIterator() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
  }

  @Override
  public ListIterator<E> listIterator(int index) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
  }

  @Override
  public List<E> subList(int fromIndex, int toIndex) {
    if (head == null){
      return null;
    }

    if (fromIndex < 0 || toIndex > size || fromIndex > toIndex){
      throw new IndexOutOfBoundsException("Index out of bounds");
    }

    LinkedList<E> subList = new LinkedList<>();
    Node aux = head;
    for (int i = 0; i < fromIndex; i++){
      aux = aux.next;
    }

    for (int i = fromIndex; i < toIndex; i++){
      subList.add(aux.data);
      aux = aux.next;
    }

    return subList;
  }

  @Override
  public void addFirst(E e) {
    if (head == null){
      add(e);
    } else {
      Node newNode = new Node(e);
      newNode.next = head;
      head.prev = newNode;
      head = newNode;
      size++;
    }
  }

  @Override
  public void addLast(E e) {
    Node newNode = new Node(e);
    if (head == null) {
      add(e);
    } else {
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
      size++;
    }
  }

  @Override
  public E peekFirst() {
    if (head == null) {
      return null;
    }
    return head.data;
  }

  @Override
  public E peekLast() {
    if (head == null){
      return null;
    }

    return tail.data;
  }

  @Override
  public E removeFirst() {
    Node aux = head;
    if (aux == null) {
      return null;
    }
    head = aux.next;
    if (head != null) {
      head.prev = null;
    } else {
      tail = null;
    }
    --size;
    aux.next = null;
    return aux.data;
  }

  @Override
  public E removeLast() {
    if (head == null){
      return null;
    }
    Node aux = tail;
    tail = aux.prev;
    if (tail != null) {
      tail.next = null;
    } else {
      head = null;
    }
    size--;
    aux.prev = null;
    return aux.data;
  }

  public String toString() {
    if (head == null) {
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
}
