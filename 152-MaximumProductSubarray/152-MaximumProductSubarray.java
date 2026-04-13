// Last updated: 4/13/2026, 10:12:42 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int minn=nums[0];
4        int maxn=nums[0];
5        int res=nums[0];
6        for(int i=1;i<nums.length;i++){
7            int num=nums[i];
8            int v1=num;
9            int v2=minn*num;
10            int v3=maxn*num;
11            maxn=Math.max(v1,Math.max(v2,v3));
12            minn=Math.min(v1,Math.min(v2,v3));
13            res=Math.max(res,Math.max(minn,maxn));
14        }
15        return res;
16        
17    }
18}