// FloodFill
class FloodFill {

  public int[][] floodFill(int[][] im, int sr, int sc, int color) {
    int old = im[sr][sc];
    if (old == color) return im;
    dfs(im, sr, sc, old, color);
    return im;
  }

  private void dfs(int[][] a, int r, int c, int old, int color) {
    if (
      r < 0 || c < 0 || r >= a.length || c >= a[0].length || a[r][c] != old
    ) return;
    a[r][c] = color;
    dfs(a, r + 1, c, old, color);
    dfs(a, r - 1, c, old, color);
    dfs(a, r, c + 1, old, color);
    dfs(a, r, c - 1, old, color);
  }
}
