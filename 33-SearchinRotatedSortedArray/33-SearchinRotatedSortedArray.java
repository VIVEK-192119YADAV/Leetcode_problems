// Last updated: 3/24/2026, 2:42:20 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int l = 0;
4        int h = nums.length - 1;
5
6        while (l <= h) {
7            int mid = (l + h) / 2;
8
9            if (nums[mid] == target) {
10                return mid;
11            }
12
13            // Left half sorted
14            if (nums[l] <= nums[mid]) {
15                if (nums[l] <= target && target < nums[mid]) {
16                    h = mid - 1;
17                } else {
18                    l = mid + 1;
19                }
20            }
21            // Right half sorted
22            else {
23                if (nums[mid] < target && target <= nums[h]) {
24                    l = mid + 1;
25                } else {
26                    h = mid - 1;
27                }
28            }
29        }
30        return -1;
31    }
32}