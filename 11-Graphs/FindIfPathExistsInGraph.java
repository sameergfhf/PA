// FindIfPathExistsInGraph
import java.util.*;

class FindIfPathExistsInGraph {

  public boolean validPath(int n, int[][] e, int s, int t) {
    List<List<Integer>> g = new ArrayList<>();
    for (int i = 0; i < n; i++) g.add(new ArrayList<>());
    for (int[] x : e) {
      g.get(x[0]).add(x[1]);
      g.get(x[1]).add(x[0]);
    }
    boolean[] v = new boolean[n];
    Deque<Integer> q = new ArrayDeque<>();
    q.add(s);
    v[s] = true;
    while (!q.isEmpty()) {
      int x = q.remove();
      if (x == t) return true;
      for (int y : g.get(x))
        if (!v[y]) {
          v[y] = true;
          q.add(y);
        }
    }
    return false;
  }
}
