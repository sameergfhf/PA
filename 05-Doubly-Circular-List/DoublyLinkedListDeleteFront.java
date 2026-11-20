// DoublyLinkedListDeleteFront
class DoublyLinkedListDeleteFront {

  static class Node {

    int val;
    Node prev, next;

    Node(int v) {
      val = v;
    }
  }

  public Node deleteFront(Node h) {
    if (h == null) return null;
    Node n = h.next;
    if (n != null) n.prev = null;
    h.next = null;
    return n;
  }
}
