// DeleteAllOccurrencesDLL
class DeleteAllOccurrencesDLL {

  static class Node {

    int val;
    Node prev, next;

    Node(int v) {
      val = v;
    }
  }

  public Node delete(Node h, int x) {
    Node p = h;
    while (p != null) {
      Node n = p.next;
      if (p.val == x) {
        if (p.prev != null) p.prev.next = p.next;
        else h = p.next;
        if (p.next != null) p.next.prev = p.prev;
      }
      p = n;
    }
    return h;
  }
}
