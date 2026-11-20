// FindMaxCLL
class FindMaxCLL {

  static class Node {

    int val;
    Node next;

    Node(int v) {
      val = v;
    }
  }

  public int max(Node h) {
    if (h == null) throw new IllegalArgumentException();
    int m = h.val;
    Node p = h.next;
    while (p != h) {
      m = Math.max(m, p.val);
      p = p.next;
    }
    return m;
  }
}
