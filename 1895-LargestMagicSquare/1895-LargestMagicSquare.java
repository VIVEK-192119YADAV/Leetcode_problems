// Last updated: 1/18/2026, 11:22:05 PM
1class Solution {
2  public int largestMagicSquare(int[][] grid) {
3    final int m = grid.length;
4    final int n = grid[0].length;
5    // prefixRow[i][j] := the sum of the first j numbers in the i-th row
6    int[][] prefixRow = new int[m][n + 1];
7    // prefixCol[i][j] := the sum of the first j numbers in the i-th column
8    int[][] prefixCol = new int[n][m + 1];
9
10    for (int i = 0; i < m; ++i)
11      for (int j = 0; j < n; ++j) {
12        prefixRow[i][j + 1] = prefixRow[i][j] + grid[i][j];
13        prefixCol[j][i + 1] = prefixCol[j][i] + grid[i][j];
14      }
15
16    for (int k = Math.min(m, n); k >= 2; --k)
17      if (containsMagicSquare(grid, prefixRow, prefixCol, k))
18        return k;
19
20    return 1;
21  }
22
23  // Returns true if the grid contains any magic square of size k x k.
24  private boolean containsMagicSquare(int[][] grid, int[][] prefixRow, int[][] prefixCol, int k) {
25    for (int i = 0; i + k - 1 < grid.length; ++i)
26      for (int j = 0; j + k - 1 < grid[0].length; ++j)
27        if (isMagicSquare(grid, prefixRow, prefixCol, i, j, k))
28          return true;
29    return false;
30  }
31
32  // Returns true if grid[i..i + k)[j..j + k) is a magic square.
33  private boolean isMagicSquare(int[][] grid, int[][] prefixRow, int[][] prefixCol, int i, int j,
34                                int k) {
35    int diag = 0;
36    int antiDiag = 0;
37    for (int d = 0; d < k; ++d) {
38      diag += grid[i + d][j + d];
39      antiDiag += grid[i + d][j + k - 1 - d];
40    }
41    if (diag != antiDiag)
42      return false;
43    for (int d = 0; d < k; ++d) {
44      if (getSum(prefixRow, i + d, j, j + k - 1) != diag)
45        return false;
46      if (getSum(prefixCol, j + d, i, i + k - 1) != diag)
47        return false;
48    }
49    return true;
50  }
51
52  // Returns sum(grid[i][l..r]) or sum(grid[l..r][i]).
53  private int getSum(int[][] prefix, int i, int l, int r) {
54    return prefix[i][r + 1] - prefix[i][l];
55  }
56}