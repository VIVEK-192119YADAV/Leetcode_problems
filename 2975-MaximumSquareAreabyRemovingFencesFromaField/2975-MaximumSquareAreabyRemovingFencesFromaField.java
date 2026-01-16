// Last updated: 1/16/2026, 11:07:04 PM
1
2class Solution {
3    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
4        // 1. Add implicit boundary fences to new lists
5        // We use Arrays to facilitate sorting and resizing
6        int[] h = Arrays.copyOf(hFences, hFences.length + 2);
7        h[hFences.length] = 1;
8        h[hFences.length + 1] = m;
9        
10        int[] v = Arrays.copyOf(vFences, vFences.length + 2);
11        v[vFences.length] = 1;
12        v[vFences.length + 1] = n;
13
14        // 2. Sort arrays
15        Arrays.sort(h);
16        Arrays.sort(v);
17
18        // 3. Store all possible horizontal gaps
19        Set<Integer> hGaps = new HashSet<>();
20        for (int i = 0; i < h.length; i++) {
21            for (int j = i + 1; j < h.length; j++) {
22                hGaps.add(h[j] - h[i]);
23            }
24        }
25
26        // 4. Check vertical gaps
27        long maxSide = -1;
28        for (int i = 0; i < v.length; i++) {
29            for (int j = i + 1; j < v.length; j++) {
30                int currentGap = v[j] - v[i];
31                if (hGaps.contains(currentGap)) {
32                    maxSide = Math.max(maxSide, currentGap);
33                }
34            }
35        }
36
37        if (maxSide == -1) return -1;
38
39        // 5. Return result modulo 10^9 + 7
40        long MOD = 1_000_000_007;
41        return (int) ((maxSide * maxSide) % MOD);
42    }
43}