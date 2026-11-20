// CircularLinkedListReversePrint
class CircularLinkedListReversePrint {

  static class Node {

    int val;
    Node next;

    Node(int v) {
      val = v;
    }
  }

  public void reversePrint(Node h) {
    if (h == null) return;
    Node t = h;
    while (t.next != h) t = t.next;
    do {
      System.out.print(t.val + " ");
      t = t.next;
    } while (t != h);
  }
}
