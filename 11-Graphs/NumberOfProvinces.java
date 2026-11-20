// NumberOfProvinces
class NumberOfProvinces {

  public int findCircleNum(int[][] a) {
    int n = a.length,
      ans = 0;
    boolean[] v = new boolean[n];
    for (int i = 0; i < n; i++) if (!v[i]) {
      ans++;
      dfs(a, i, v);
    }
    return ans;
  }

  private void dfs(int[][] a, int i, boolean[] v) {
    v[i] = true;
    for (int j = 0; j < a.length; j++) if (a[i][j] == 1 && !v[j]) dfs(a, j, v);
  }
}
