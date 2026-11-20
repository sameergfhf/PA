// DoublyLinkedListReverse
class DoublyLinkedListReverse {

  static class Node {

    int val;
    Node prev, next;

    Node(int v) {
      val = v;
    }
  }

  public Node reverse(Node h) {
    Node p = h,
      last = null;
    while (p != null) {
      Node n = p.next;
      p.next = p.prev;
      p.prev = n;
      last = p;
      p = n;
    }
    return last;
  }
}
