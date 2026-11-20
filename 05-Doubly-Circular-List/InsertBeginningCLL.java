// InsertBeginningCLL
class InsertBeginningCLL {

  static class Node {

    int val;
    Node next;

    Node(int v) {
      val = v;
    }
  }

  public Node insert(Node h, int x) {
    Node n = new Node(x);
    if (h == null) {
      n.next = n;
      return n;
    }
    Node t = h;
    while (t.next != h) t = t.next;
    t.next = n;
    n.next = h;
    return n;
  }
}
