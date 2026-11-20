// DesignLinkedList707
class DesignLinkedList707 {

  static class Node {

    int v;
    Node n;

    Node(int x) {
      v = x;
    }
  }

  Node h;
  int size;

  public int get(int i) {
    if (i < 0 || i >= size) return -1;
    Node p = h;
    while (i-- > 0) p = p.n;
    return p.v;
  }

  public void addAtHead(int x) {
    Node n = new Node(x);
    n.n = h;
    h = n;
    size++;
  }

  public void addAtTail(int x) {
    addAtIndex(size, x);
  }

  public void addAtIndex(int i, int x) {
    if (i > size) return;
    if (i <= 0) {
      addAtHead(x);
      return;
    }
    Node p = h;
    for (int j = 1; j < i; j++) p = p.n;
    Node n = new Node(x);
    n.n = p.n;
    p.n = n;
    size++;
  }

  public void deleteAtIndex(int i) {
    if (i < 0 || i >= size) return;
    if (i == 0) h = h.n;
    else {
      Node p = h;
      for (int j = 1; j < i; j++) p = p.n;
      p.n = p.n.n;
    }
    size--;
  }
}
