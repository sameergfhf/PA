// CheckPalindromeDLL
class CheckPalindromeDLL {

  static class Node {

    int val;
    Node prev, next;

    Node(int v) {
      val = v;
    }
  }

  public boolean isPalindrome(Node h) {
    if (h == null) return true;
    Node t = h;
    while (t.next != null) t = t.next;
    while (h != t && h.prev != t) {
      if (h.val != t.val) return false;
      h = h.next;
      t = t.prev;
    }
    return h.val == t.val;
  }
}
