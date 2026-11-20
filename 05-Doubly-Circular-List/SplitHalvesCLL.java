// SplitHalvesCLL
class SplitHalvesCLL {

  static class Node {

    int val;
    Node next;

    Node(int v) {
      val = v;
    }
  }

  public Node[] split(Node h) {
    if (h == null) return new Node[] { null, null };
    Node s = h,
      f = h;
    while (f.next != h && f.next.next != h) {
      s = s.next;
      f = f.next.next;
    }
    Node second = s.next;
    s.next = h;
    if (f.next == h) f.next = second;
    else f.next.next = second;
    return new Node[] { h, second };
  }
}
