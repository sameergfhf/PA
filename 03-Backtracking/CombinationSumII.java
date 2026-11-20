// CombinationSumII
import java.util.*;

class CombinationSumII {

  public List<List<Integer>> combinationSum2(int[] c, int t) {
    Arrays.sort(c);
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
    for (int j = i; j < c.length && c[j] <= rem; j++) {
      if (j > i && c[j] == c[j - 1]) continue;
      p.add(c[j]);
      dfs(c, rem - c[j], j + 1, p, r);
      p.remove(p.size() - 1);
    }
  }
}
