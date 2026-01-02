// Last updated: 1/2/2026, 3:41:20 PM
1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        int i=0;
4        int j=nums.length-1;
5        while(i<j){
6            int mod1=nums[i]%2;
7            int mod2=nums[j]%2;
8            if(mod1==1&& mod2==0){
9                int temp=nums[i];
10                nums[i]=nums[j];
11                nums[j]=temp;
12            }
13            if(mod1==0){
14                i++;
15            }
16            if(mod2==1){
17                j--;
18            }
19        }
20        return nums;
21        
22        
23    }
24}