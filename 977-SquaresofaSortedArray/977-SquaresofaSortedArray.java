// Last updated: 1/1/2026, 11:53:59 PM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int n=nums.length;
4        int res[]=new int [n] ;
5        int l=0;
6        int r=nums.length-1;
7        for(int i=n-1;i>=0;i--){
8            int val;
9            if(Math.abs(nums[l])>Math.abs(nums[r])){
10                val=nums[l];
11                l++;
12
13            }
14            else{
15                val=nums[r];
16                r--;
17            }
18             res[i]=val*val;
19        }    
20        return res;   
21    }
22}