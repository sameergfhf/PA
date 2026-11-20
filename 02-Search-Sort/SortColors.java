// SortColors
class SortColors {

  public void sortColors(int[] a) {
    int low = 0,
      mid = 0,
      high = a.length - 1;
    while (mid <= high) {
      if (a[mid] == 0) swap(a, low++, mid++);
      else if (a[mid] == 1) mid++;
      else swap(a, mid, high--);
    }
  }

  private void swap(int[] a, int i, int j) {
    int t = a[i];
    a[i] = a[j];
    a[j] = t;
  }
}
