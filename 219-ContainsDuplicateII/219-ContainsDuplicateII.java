// Last updated: 2/13/2026, 12:23:28 AM
1// Time Complexity : O(n)
2class Solution {
3    public boolean containsNearbyDuplicate(int[] nums, int k) {
4        // Base case...
5        if(nums == null || nums.length < 2 || k == 0)
6            return false;
7        int i = 0;
8        // Create a Hash Set for storing previous of k elements...
9        HashSet<Integer> hset = new HashSet<Integer>();
10        // Traverse for all elements of the given array in a for loop...
11        for(int j = 0; j < nums.length; j++) {
12            // If duplicate element is present at distance less than equal to k, return true...
13            if(!hset.add(nums[j])){
14                return true;
15            }
16            // If size of the Hash Set becomes greater than k...
17            if(hset.size() >= k+1){
18                // Remove the last visited element from the set...
19                hset.remove(nums[i++]);
20            }
21        }
22        // If no duplicate element is found then return false...
23        return false;
24    }
25}