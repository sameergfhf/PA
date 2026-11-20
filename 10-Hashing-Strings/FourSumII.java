// FourSumII
import java.util.*;

class FourSumII {

  public int fourSumCount(int[] a, int[] b, int[] c, int[] d) {
    Map<Integer, Integer> m = new HashMap<>();
    for (int x : a) for (int y : b) m.put(x + y, m.getOrDefault(x + y, 0) + 1);
    int ans = 0;
    for (int x : c) for (int y : d) ans += m.getOrDefault(-(x + y), 0);
    return ans;
  }
}
