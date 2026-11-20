// CountOccurrencesBinarySearch
class CountOccurrencesBinarySearch {

  public int count(int[] a, int x) {
    return upper(a, x) - lower(a, x);
  }

  private int lower(int[] a, int x) {
    int l = 0,
      r = a.length;
    while (l < r) {
      int m = (l + r) / 2;
      if (a[m] < x) l = m + 1;
      else r = m;
    }
    return l;
  }

  private int upper(int[] a, int x) {
    int l = 0,
      r = a.length;
    while (l < r) {
      int m = (l + r) / 2;
      if (a[m] <= x) l = m + 1;
      else r = m;
    }
    return l;
  }
}
