// DeleteMiddleNodeDLL
class DeleteMiddleNodeDLL {

  static class Node {

    int val;
    Node prev, next;

    Node(int v) {
      val = v;
    }
  }

  public Node deleteMiddle(Node h) {
    if (h == null || h.next == null) return null;
    Node s = h,
      f = h;
    while (f.next != null && f.next.next != null) {
      s = s.next;
      f = f.next.next;
    }
    Node x = s.next;
    if (x.next != null) x.next.prev = s;
    s.next = x.next;
    return h;
  }
}
