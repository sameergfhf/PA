// JosephusProblemCLL
class JosephusProblemCLL {

  static class Node {

    int val;
    Node next;

    Node(int v) {
      val = v;
    }
  }

  public int survivor(int n, int k) {
    int s = 0;
    for (int i = 1; i <= n; i++) s = (s + k) % i;
    return s + 1;
  }
}
