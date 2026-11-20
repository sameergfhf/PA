// MergeSort
class MergeSort {

  public void sort(int[] a) {
    if (a.length > 1) sort(a, 0, a.length - 1);
  }

  private void sort(int[] a, int l, int r) {
    if (l >= r) return;
    int m = l + (r - l) / 2;
    sort(a, l, m);
    sort(a, m + 1, r);
    int[] t = new int[r - l + 1];
    int i = l,
      j = m + 1,
      k = 0;
    while (i <= m && j <= r) t[k++] = a[i] <= a[j] ? a[i++] : a[j++];
    while (i <= m) t[k++] = a[i++];
    while (j <= r) t[k++] = a[j++];
    System.arraycopy(t, 0, a, l, t.length);
  }
}
