// Last updated: 6/24/2026, 12:13:52 AM
1class Solution {
2    public int[] getAverages(int[] nums, int k) {
3        int n= nums.length;
4        long sum=0;
5        int []ans=new int[n];
6        Arrays.fill(ans,-1);
7        int ws=2*k+1;
8        if(ws>n)return ans;
9    
10        for(int i=0;i<ws;i++){
11            sum+=nums[i];
12
13
14        }
15        ans[k]=(int )(sum/ws);
16        for(int i=ws;i<n;i++){
17            sum=sum+nums[i]-nums[i-ws];
18            ans[i-k]=(int)(sum/ws);
19           
20
21
22        }
23        return ans;
24
25        
26    }
27}