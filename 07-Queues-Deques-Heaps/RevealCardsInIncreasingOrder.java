// RevealCardsInIncreasingOrder
import java.util.*;

class RevealCardsInIncreasingOrder {

  public int[] deckRevealedIncreasing(int[] d) {
    Arrays.sort(d);
    Queue<Integer> q = new ArrayDeque<>();
    for (int i = 0; i < d.length; i++) q.add(i);
    int[] r = new int[d.length];
    for (int x : d) {
      int idx = q.remove();
      r[idx] = x;
      if (!q.isEmpty()) q.add(q.remove());
    }
    return r;
  }
}
