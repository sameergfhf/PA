// QuickSort
class QuickSort {

  public void sort(int[] a) {
    if (a.length > 0) quick(a, 0, a.length - 1);
  }

  private void quick(int[] a, int l, int r) {
    if (l >= r) return;
    int p = partition(a, l, r);
    quick(a, l, p - 1);
    quick(a, p + 1, r);
  }

  private int partition(int[] a, int l, int r) {
    int pivot = a[r],
      i = l;
    for (int j = l; j < r; j++) if (a[j] <= pivot) {
      int t = a[i];
      a[i++] = a[j];
      a[j] = t;
    }
    int t = a[i];
    a[i] = a[r];
    a[r] = t;
    return i;
  }
}
