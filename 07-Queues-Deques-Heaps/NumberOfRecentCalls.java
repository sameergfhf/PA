// NumberOfRecentCalls
import java.util.*;

class NumberOfRecentCalls {

  Queue<Integer> q = new ArrayDeque<>();

  public int ping(int t) {
    q.add(t);
    while (q.peek() < t - 3000) q.remove();
    return q.size();
  }
}
