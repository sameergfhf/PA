// DesignCircularDeque
class DesignCircularDeque {

  int[] a;
  int head = 0,
    n = 0;

  DesignCircularDeque(int k) {
    a = new int[k];
  }

  public boolean insertFront(int x) {
    if (isFull()) return false;
    head = (head - 1 + a.length) % a.length;
    a[head] = x;
    n++;
    return true;
  }

  public boolean insertLast(int x) {
    if (isFull()) return false;
    a[(head + n) % a.length] = x;
    n++;
    return true;
  }

  public boolean deleteFront() {
    if (isEmpty()) return false;
    head = (head + 1) % a.length;
    n--;
    return true;
  }

  public boolean deleteLast() {
    if (isEmpty()) return false;
    n--;
    return true;
  }

  public int getFront() {
    return isEmpty() ? -1 : a[head];
  }

  public int getRear() {
    return isEmpty() ? -1 : a[(head + n - 1) % a.length];
  }

  public boolean isEmpty() {
    return n == 0;
  }

  public boolean isFull() {
    return n == a.length;
  }
}
