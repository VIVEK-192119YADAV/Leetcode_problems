// Last updated: 4/13/2026, 9:58:03 PM
1class Solution {
2    public int maxAbsoluteSum(int[] nums) {
3        
4        int maxn=0 , minn=0;
5        int maxs=0, mins=0;
6        for(int num:nums){
7            maxn=Math.max(num,maxn + num);
8            maxs=Math.max(maxn,maxs);
9             
10             minn=Math.min(num, minn+num);
11             mins=Math.min(mins,minn);
12                    }
13                    return Math.max(Math.abs(mins),Math.abs(maxs));
14    }
15}