// MergeKSortedLists
import java.util.*;

class MergeKSortedLists {

  static class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

  public ListNode mergeKLists(ListNode[] a) {
    PriorityQueue<ListNode> q = new PriorityQueue<>((x, y) ->
      Integer.compare(x.val, y.val)
    );
    for (ListNode n : a) if (n != null) q.add(n);
    ListNode d = new ListNode(0),
      p = d;
    while (!q.isEmpty()) {
      ListNode n = q.poll();
      p.next = n;
      p = n;
      if (n.next != null) q.add(n.next);
    }
    p.next = null;
    return d.next;
  }
}
