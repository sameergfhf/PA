// SearchElementCLL
class SearchElementCLL {

  static class Node {

    int val;
    Node next;

    Node(int v) {
      val = v;
    }
  }

  public boolean search(Node h, int x) {
    if (h == null) return false;
    Node p = h;
    do {
      if (p.val == x) return true;
      p = p.next;
    } while (p != h);
    return false;
  }
}
