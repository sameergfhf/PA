// CircularBufferRotation
class CircularBufferRotation {

  public int[] rotate(int[] a, int k) {
    if (a.length == 0) return a;
    k = ((k % a.length) + a.length) % a.length;
    int[] r = new int[a.length];
    for (int i = 0; i < a.length; i++) r[(i + k) % a.length] = a[i];
    return r;
  }
}
