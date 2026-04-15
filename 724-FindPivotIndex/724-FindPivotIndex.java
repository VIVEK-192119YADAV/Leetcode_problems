// Last updated: 4/15/2026, 8:53:29 AM
1class Solution {
2    public int pivotIndex(int[] nums) {
3       int sum=0;
4       int left=0;
5       int right;
6       for(int i=0;i<nums.length;i++){
7        sum+=nums[i];
8         }
9        
10       for(int i=0;i<nums.length;i++){
11     
12        right=sum-nums[i]-left;
13        if(left==right){
14            return i;
15        }
16         left+=nums[i];
17       }
18       
19      
20        return -1;
21    }
22}