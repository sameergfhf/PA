// DeleteNodeCLL
class DeleteNodeCLL {

  static class Node {

    int val;
    Node next;

    Node(int v) {
      val = v;
    }
  }

  public Node delete(Node h, int x) {
    if (h == null) return null;
    Node p = h,
      prev = null;
    do {
      if (p.val == x) {
        if (prev == null) {
          if (p.next == h) return null;
          Node t = h;
          while (t.next != h) t = t.next;
          t.next = h.next;
          h = h.next;
        } else prev.next = p.next;
        return h;
      }
      prev = p;
      p = p.next;
    } while (p != h);
    return h;
  }
}
