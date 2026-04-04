// Last updated: 4/4/2026, 2:58:10 PM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int n = nums.length;
4        int[] result = new int[n];
5
6        int left = 0, right = n - 1;
7        int index = n - 1;
8
9        while (left <= right) {
10            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
11                result[index] = nums[left] * nums[left];
12                left++;
13            } else {
14                result[index] = nums[right] * nums[right];
15                right--;
16            }
17            index--;
18        }
19
20        return result;
21    }
22}