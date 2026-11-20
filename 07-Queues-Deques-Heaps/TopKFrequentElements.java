// TopKFrequentElements
import java.util.*;

class TopKFrequentElements {

  public int[] topKFrequent(int[] a, int k) {
    Map<Integer, Integer> m = new HashMap<>();
    for (int x : a) m.put(x, m.getOrDefault(x, 0) + 1);
    PriorityQueue<Integer> q = new PriorityQueue<>(
      (x, y) -> m.get(x) - m.get(y)
    );
    for (int x : m.keySet()) {
      q.add(x);
      if (q.size() > k) q.poll();
    }
    int[] r = new int[k];
    for (int i = k - 1; i >= 0; i--) r[i] = q.poll();
    return r;
  }
}
