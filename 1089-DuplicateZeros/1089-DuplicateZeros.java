// Last updated: 1/1/2026, 11:24:16 PM
1class Solution {
2    public void duplicateZeros(int[] arr) {
3        int[] n = new int[arr.length];
4        int s =0;
5        int des = 0;
6
7        while (s < arr.length && des < arr.length) {
8            if (arr[s] == 0) {
9                n[des++] = 0;
10                if (des < arr.length) {
11                    n[des++] = 0;
12                }
13            } else {
14                n[des++] = arr[s];
15            }
16            s++;
17        }
18
19        
20        for (int i = 0; i < arr.length; i++) {
21            arr[i] = n[i];
22        }
23    }
24}
25