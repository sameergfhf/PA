// SlidingWindowMaximumWithDeque
class SlidingWindowMaximumWithDeque {

  public int[] maxSlidingWindow(int[] a, int k) {
    if (a.length == 0 || k == 0) return new int[0];
    int[] r = new int[a.length - k + 1],
      q = new int[a.length];
    int h = 0,
      t = 0;
    for (int i = 0; i < a.length; i++) {
      while (h < t && q[h] <= i - k) h++;
      while (h < t && a[q[t - 1]] <= a[i]) t--;
      q[t++] = i;
      if (i >= k - 1) r[i - k + 1] = a[q[h]];
    }
    return r;
  }
}
