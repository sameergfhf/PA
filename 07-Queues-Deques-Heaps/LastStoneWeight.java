// LastStoneWeight
import java.util.*;

class LastStoneWeight {

  public int lastStoneWeight(int[] a) {
    PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
    for (int x : a) q.add(x);
    while (q.size() > 1) {
      int x = q.poll(),
        y = q.poll();
      if (x > y) q.add(x - y);
    }
    return q.isEmpty() ? 0 : q.peek();
  }
}
