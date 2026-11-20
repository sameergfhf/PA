// DoublyLinkedListTraversal
class DoublyLinkedListTraversal {

  static class Node {

    int val;
    Node prev, next;

    Node(int v) {
      val = v;
    }
  }

  public void printForward(Node h) {
    for (Node p = h; p != null; p = p.next) System.out.print(p.val + " ");
  }

  public void printBackward(Node h) {
    if (h == null) return;
    while (h.next != null) h = h.next;
    for (Node p = h; p != null; p = p.prev) System.out.print(p.val + " ");
  }
}
