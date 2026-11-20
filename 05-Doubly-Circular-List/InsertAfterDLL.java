// InsertAfterDLL
class InsertAfterDLL {

  static class Node {

    int val;
    Node prev, next;

    Node(int v) {
      val = v;
    }
  }

  public void insertAfter(Node p, int x) {
    if (p == null) return;
    Node n = new Node(x);
    n.next = p.next;
    n.prev = p;
    if (p.next != null) p.next.prev = n;
    p.next = n;
  }
}
