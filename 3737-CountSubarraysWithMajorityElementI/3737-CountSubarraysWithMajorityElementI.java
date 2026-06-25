// Last updated: 6/26/2026, 12:16:00 AM
1class Solution {
2    public int countMajoritySubarrays(int[] nums, int target) {
3        int cnt = 0;
4
5        for (int i = 0; i < nums.length; i++) {
6            int fre = 0;
7
8            for (int j = i; j < nums.length; j++) {
9
10                if (nums[j] == target) {
11                    fre++;
12                }
13
14                int len = j - i + 1;
15
16                if (fre > len / 2) {
17                    cnt++;
18                }
19            }
20        }
21
22        return cnt;
23    }
24}