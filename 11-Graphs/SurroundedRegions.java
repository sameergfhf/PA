// SurroundedRegions
class SurroundedRegions {

  public void solve(char[][] b) {
    if (b.length == 0) return;
    int m = b.length,
      n = b[0].length;
    for (int i = 0; i < m; i++) {
      mark(b, i, 0);
      mark(b, i, n - 1);
    }
    for (int j = 0; j < n; j++) {
      mark(b, 0, j);
      mark(b, m - 1, j);
    }
    for (int i = 0; i < m; i++) for (int j = 0; j < n; j++) b[i][j] =
      b[i][j] == '#' ? 'O' : 'X';
  }

  private void mark(char[][] b, int i, int j) {
    if (
      i < 0 || j < 0 || i >= b.length || j >= b[0].length || b[i][j] != 'O'
    ) return;
    b[i][j] = '#';
    mark(b, i + 1, j);
    mark(b, i - 1, j);
    mark(b, i, j + 1);
    mark(b, i, j - 1);
  }
}
