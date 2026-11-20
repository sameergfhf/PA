// KeysAndRooms
import java.util.*;

class KeysAndRooms {

  public boolean canVisitAllRooms(List<List<Integer>> r) {
    boolean[] v = new boolean[r.size()];
    Deque<Integer> s = new ArrayDeque<>();
    s.push(0);
    v[0] = true;
    int count = 0;
    while (!s.isEmpty()) {
      int x = s.pop();
      count++;
      for (int k : r.get(x))
        if (!v[k]) {
          v[k] = true;
          s.push(k);
        }
    }
    return count == r.size();
  }
}
