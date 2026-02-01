// Last updated: 2/1/2026, 8:55:18 PM
1class Solution {
2    public int minimumCost(int[] nums) {
3        int score=nums[0];
4        int firstMin=Integer.MAX_VALUE;
5        int secondmin=Integer.MAX_VALUE;
6        for(int i=1;i<nums.length;i++){
7            if(nums[i]<firstMin){
8                secondmin=firstMin;
9                firstMin=nums[i];
10
11            }
12            else if(nums[i]<secondmin){
13                secondmin=nums[i];
14            }
15        }
16        return score +firstMin +secondmin;
17    }
18    
19}