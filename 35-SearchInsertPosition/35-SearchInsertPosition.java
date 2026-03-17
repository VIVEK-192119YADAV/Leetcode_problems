// Last updated: 3/18/2026, 12:04:32 AM
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3
4        int start = 0;
5        int end = nums.length - 1;
6        int mid = 0;
7
8        while (start <= end) {
9
10            mid = start + (end - start) / 2;
11
12            if (nums[mid] == target) {
13                return mid;
14            }
15
16            else if (nums[mid] < target) {
17                start = mid + 1;
18            }
19
20            else {
21                end = mid - 1;
22            }
23        }
24
25        return (target > nums[mid]) ? mid + 1 : mid;
26    }
27}