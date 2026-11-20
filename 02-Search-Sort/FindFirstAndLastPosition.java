// FindFirstAndLastPosition
class FindFirstAndLastPosition {

  public int[] searchRange(int[] a, int t) {
    return new int[] { bound(a, t, false), bound(a, t, true) };
  }

  private int bound(int[] a, int t, boolean upper) {
    int l = 0,
      r = a.length;
    while (l < r) {
      int m = (l + r) / 2;
      if (a[m] < t || (upper && a[m] == t)) l = m + 1;
      else r = m;
    }
    return l;
  }
}
