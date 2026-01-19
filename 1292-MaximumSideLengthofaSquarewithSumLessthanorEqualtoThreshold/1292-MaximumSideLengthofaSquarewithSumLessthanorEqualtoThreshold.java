// Last updated: 1/19/2026, 3:23:31 PM
1class Solution {
2    public int maxSideLength(int[][] mat, int threshold) {
3        int m = mat.length, n = mat[0].length;
4        int[][] prefix = new int[m + 1][n + 1];
5        
6        // Build prefix sum
7        for (int i = 0; i < m; i++) {
8            for (int j = 0; j < n; j++) {
9                prefix[i + 1][j + 1] = mat[i][j] + prefix[i][j + 1] + prefix[i + 1][j] - prefix[i][j];
10            }
11        }
12        
13        int left = 0, right = Math.min(m, n), ans = 0;
14        while (left <= right) {
15            int mid = left + (right - left) / 2;
16            boolean found = false;
17            for (int i = mid; i <= m && !found; i++) {
18                for (int j = mid; j <= n && !found; j++) {
19                    int sum = prefix[i][j] - prefix[i - mid][j] - prefix[i][j - mid] + prefix[i - mid][j - mid];
20                    if (sum <= threshold) found = true;
21                }
22            }
23            if (found) {
24                ans = mid;
25                left = mid + 1;
26            } else {
27                right = mid - 1;
28            }
29        }
30        return ans;
31    }
32}