// Last updated: 6/16/2026, 12:25:39 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int  n= nums.length;
4        int i=0;
5        int j=1;
6        int k=1;
7        while(j<n){
8            if(nums[j]==nums[j-1]){
9                j++;
10                continue;
11
12            }
13            else{
14            nums[i+1]=nums[j];
15            i++;
16            k++;
17            }
18            j++;
19
20           
21        }
22
23         return k;
24        
25    }
26}