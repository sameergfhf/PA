// CombinationSum
import java.util.*;

class CombinationSum {

  public List<List<Integer>> combinationSum(int[] c, int t) {
    List<List<Integer>> r = new ArrayList<>();
    dfs(c, t, 0, new ArrayList<>(), r);
    return r;
  }

  private void dfs(
    int[] c,
    int rem,
    int i,
    List<Integer> p,
    List<List<Integer>> r
  ) {
    if (rem == 0) {
      r.add(new ArrayList<>(p));
      return;
    }
    for (int j = i; j < c.length; j++) if (c[j] <= rem) {
      p.add(c[j]);
      dfs(c, rem - c[j], j, p, r);
      p.remove(p.size() - 1);
    }
  }
}
