// SecondLargestDLL
class SecondLargestDLL {

  static class Node {

    int val;
    Node prev, next;

    Node(int v) {
      val = v;
    }
  }

  public Integer secondLargest(Node h) {
    Integer m1 = null,
      m2 = null;
    for (Node p = h; p != null; p = p.next) {
      int x = p.val;
      if (m1 == null || x > m1) {
        m2 = m1;
        m1 = x;
      } else if (x != m1 && (m2 == null || x > m2)) m2 = x;
    }
    return m2;
  }
}
