// Last updated: 7/23/2026, 11:13:00 AM
1class Solution {
2
3    void dfs(int cl, int rw, int[][] vis, char[][] grd) {
4
5        int n = grd.length;
6        int m = grd[0].length;
7
8        vis[rw][cl] = 1;
9
10        if (rw + 1 < n && grd[rw + 1][cl] == '1' && vis[rw + 1][cl] == 0)
11            dfs(cl, rw + 1, vis, grd);
12
13        if (rw - 1 >= 0 && grd[rw - 1][cl] == '1' && vis[rw - 1][cl] == 0)
14            dfs(cl, rw - 1, vis, grd);
15
16        if (cl + 1 < m && grd[rw][cl + 1] == '1' && vis[rw][cl + 1] == 0)
17            dfs(cl + 1, rw, vis, grd);
18
19        if (cl - 1 >= 0 && grd[rw][cl - 1] == '1' && vis[rw][cl - 1] == 0)
20            dfs(cl - 1, rw, vis, grd);
21    }
22
23    public int numIslands(char[][] grd) {
24
25        int n = grd.length;
26        int m = grd[0].length;
27
28        int[][] vis = new int[n][m];
29        int cnt = 0;
30
31        for (int i = 0; i < n; i++) {
32            for (int j = 0; j < m; j++) {
33
34                if (grd[i][j] == '1' && vis[i][j] == 0) {
35                    dfs(j, i, vis, grd);
36                    cnt++;
37                }
38            }
39        }
40
41        return cnt;
42    }
43}