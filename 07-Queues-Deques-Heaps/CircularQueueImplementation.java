// CircularQueueImplementation
class CircularQueueImplementation {

  private int[] a;
  private int front = 0,
    size = 0;

  CircularQueueImplementation(int capacity) {
    a = new int[capacity];
  }

  public boolean offer(int x) {
    if (size == a.length) return false;
    a[(front + size) % a.length] = x;
    size++;
    return true;
  }

  public int poll() {
    if (size == 0) return -1;
    int x = a[front];
    front = (front + 1) % a.length;
    size--;
    return x;
  }

  public int peek() {
    return size == 0 ? -1 : a[front];
  }

  public int size() {
    return size;
  }
}
