// Last updated: 3/29/2026, 11:31:44 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        Map<Integer, Integer> pairIdx = new HashMap<>();
4
5        for (int i = 0; i < nums.length; i++) {
6            int num = nums[i];
7            if (pairIdx.containsKey(target - num)) {
8                return new int[] { i, pairIdx.get(target - num) };
9            }
10            pairIdx.put(num, i);
11        }
12
13        return new int[] {};        
14    }
15}