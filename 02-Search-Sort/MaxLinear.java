// MaxLinear
class MaxLinear {

  public int max(int[] a) {
    if (a.length == 0) throw new IllegalArgumentException("Empty array");
    int m = a[0];
    for (int x : a) m = Math.max(m, x);
    return m;
  }
}
