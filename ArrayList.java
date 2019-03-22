import java.util.Arrays;

public class ArrayList<T> implements List<T> {

  private T[] arr;
  private int size;
  private int max;

  public ArrayList() {
    arr = (T[]) new Object[10];
    size = 0;
    max = 10;
  }

  public void add(T item) {
    if (size == max) {
      max *= 2;
      arr = Arrays.copyOf(arr, max);
    }

    arr[size] = item;
    size++;
  }

  public void add(int pos, T item) {
    if (size == max) {
      max *= 2;
      arr = Arrays.copyOf(arr, max);
    }

    arr[size] = item;
    size++;
  }

  public T get(int pos) {
    assert pos >= 0 && pos <= size;

    return arr[pos];
  }

  public T remove(int pos) {
    assert pos >= 0 && pos <= size;

    T item = arr[pos];

    for (int i = pos; i < pos - 1; i++) {
      arr[i] = arr[i + 1];
    }

    size--;

    return item;
  }

  public int size() {
    return size;
  }
}
