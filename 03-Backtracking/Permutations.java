// Permutations
import java.util.*;

class Permutations {

  public List<List<Integer>> permute(int[] a) {
    List<List<Integer>> r = new ArrayList<>();
    go(a, new boolean[a.length], new ArrayList<>(), r);
    return r;
  }

  private void go(
    int[] a,
    boolean[] u,
    List<Integer> p,
    List<List<Integer>> r
  ) {
    if (p.size() == a.length) {
      r.add(new ArrayList<>(p));
      return;
    }
    for (int i = 0; i < a.length; i++) if (!u[i]) {
      u[i] = true;
      p.add(a[i]);
      go(a, u, p, r);
      p.remove(p.size() - 1);
      u[i] = false;
    }
  }
}
