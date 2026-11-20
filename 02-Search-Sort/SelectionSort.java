// SelectionSort
class SelectionSort {

  public void sort(int[] a) {
    for (int i = 0; i < a.length; i++) {
      int m = i;
      for (int j = i + 1; j < a.length; j++) if (a[j] < a[m]) m = j;
      int t = a[i];
      a[i] = a[m];
      a[m] = t;
    }
  }
}
