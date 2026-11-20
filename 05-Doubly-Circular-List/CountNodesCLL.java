// CountNodesCLL
class CountNodesCLL {

  static class Node {

    int val;
    Node next;

    Node(int v) {
      val = v;
    }
  }

  public int count(Node h) {
    if (h == null) return 0;
    int c = 0;
    Node p = h;
    do {
      c++;
      p = p.next;
    } while (p != h);
    return c;
  }
}
