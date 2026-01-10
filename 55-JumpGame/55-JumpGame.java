// Last updated: 1/10/2026, 11:58:21 PM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int lastpos=nums.length-1;
4        for(int i=nums.length-2;i>=0;i--){
5            if(i+nums[i]>=lastpos){
6                lastpos=i;
7            }
8        }
9        return lastpos ==0;
10    }
11}