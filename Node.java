
public class Node<T> {
  T data;
  Node<T> next;
  
  public Node(T data) {
    this.data = data;
    this.next = null;
  }
  
  public T get() {
    return data;
  }
  
  public Node<T> getNext() {
    return next;
  }

  public void setNext(Node<T> nextNode) {
    next = nextNode;
  }
}
