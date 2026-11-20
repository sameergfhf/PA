// Subsets
import java.util.*;

class Subsets {

  public List<List<Integer>> subsets(int[] a) {
    List<List<Integer>> r = new ArrayList<>();
    go(a, 0, new ArrayList<>(), r);
    return r;
  }

  private void go(int[] a, int i, List<Integer> p, List<List<Integer>> r) {
    r.add(new ArrayList<>(p));
    for (int j = i; j < a.length; j++) {
      p.add(a[j]);
      go(a, j + 1, p, r);
      p.remove(p.size() - 1);
    }
  }
}
