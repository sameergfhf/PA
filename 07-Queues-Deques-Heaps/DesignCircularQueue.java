// DesignCircularQueue
class DesignCircularQueue {

  int[] a;
  int head = 0,
    count = 0;

  DesignCircularQueue(int k) {
    a = new int[k];
  }

  public boolean enQueue(int v) {
    if (isFull()) return false;
    a[(head + count) % a.length] = v;
    count++;
    return true;
  }

  public boolean deQueue() {
    if (isEmpty()) return false;
    head = (head + 1) % a.length;
    count--;
    return true;
  }

  public int Front() {
    return isEmpty() ? -1 : a[head];
  }

  public int Rear() {
    return isEmpty() ? -1 : a[(head + count - 1) % a.length];
  }

  public boolean isEmpty() {
    return count == 0;
  }

  public boolean isFull() {
    return count == a.length;
  }
}
