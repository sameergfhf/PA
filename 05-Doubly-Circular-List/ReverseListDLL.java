// ReverseListDLL
class ReverseListDLL {

  static class Node {

    int val;
    Node prev, next;

    Node(int v) {
      val = v;
    }
  }

  public Node reverse(Node h) {
    Node prev = null,
      cur = h;
    while (cur != null) {
      Node n = cur.next;
      cur.next = prev;
      cur.prev = n;
      prev = cur;
      cur = n;
    }
    return prev;
  }
}
