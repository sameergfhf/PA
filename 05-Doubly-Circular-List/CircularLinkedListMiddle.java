// CircularLinkedListMiddle
class CircularLinkedListMiddle {

  static class Node {

    int val;
    Node next;

    Node(int v) {
      val = v;
    }
  }

  public Node middle(Node h) {
    if (h == null) return null;
    Node s = h,
      f = h;
    do {
      if (f.next == h || f.next.next == h) break;
      s = s.next;
      f = f.next.next;
    } while (s != f);
    if (f.next == h) s = s.next;
    return s;
  }
}
