// SubsetsII
import java.util.*;

class SubsetsII {

  public List<List<Integer>> subsetsWithDup(int[] a) {
    Arrays.sort(a);
    List<List<Integer>> r = new ArrayList<>();
    go(a, 0, new ArrayList<>(), r);
    return r;
  }

  private void go(int[] a, int i, List<Integer> p, List<List<Integer>> r) {
    r.add(new ArrayList<>(p));
    for (int j = i; j < a.length; j++) {
      if (j > i && a[j] == a[j - 1]) continue;
      p.add(a[j]);
      go(a, j + 1, p, r);
      p.remove(p.size() - 1);
    }
  }
}
