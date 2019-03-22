
public class LinkedList<T> implements List<T> {

  private Node<T> head;
  private int size;

  public LinkedList() {
    head = null;
    size = 0;
  }

  public void add(T item) {
    if (head == null) {
      head = new Node<T>(item);
      size++;
    } else {
      Node<T> curr = head;

      while (curr.getNext() != null) {
        curr = curr.getNext();
      }

      curr.setNext(new Node<T>(item));
      size++;
    }

  }

  public void add(int pos, T item) {
    if (pos == 0) {
      Node<T> newNode = new Node<T>(item);
      newNode.setNext(head);
      head = newNode;
      size++;
    } else {
      Node<T> curr = head;

      for (int i = 0; i < pos - 1; i++) {
        curr = curr.getNext();
      }

      Node<T> nextNode = new Node<T>(item);
      nextNode.setNext(curr.getNext());

      curr.setNext(nextNode);
      size++;
    }
  }

  public T get(int pos) {
    Node<T> curr = head;

    for (int i = 0; i < pos; i++) {
      curr = curr.getNext();
    }

    return curr.get();
  }

  public T remove(int pos) {
    Node<T> prev, curr;

    if (pos == 0) {
      curr = head;
      head = head.getNext();
    } else {
      prev = head;

      for (int i = 0; i < pos - 1; i++) {
        prev = prev.getNext();
      }

      curr = prev.getNext();
      prev.setNext(curr.getNext());
    }

    size--;
    return curr.get();
  }

  public int size() {
    return size;
  }
}
