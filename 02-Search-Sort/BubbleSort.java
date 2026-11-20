// BubbleSort
class BubbleSort {

  public void sort(int[] a) {
    for (int i = 0; i < a.length; i++) {
      boolean changed = false;
      for (int j = 0; j < a.length - 1 - i; j++) if (a[j] > a[j + 1]) {
        int t = a[j];
        a[j] = a[j + 1];
        a[j + 1] = t;
        changed = true;
      }
      if (!changed) break;
    }
  }
}
