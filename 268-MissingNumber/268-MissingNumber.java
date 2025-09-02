// Last updated: 9/2/2025, 1:48:13 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        n=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<=nums.length-1;i++){
            sum=sum+nums[i];
        }
        int k=n-sum;
        return k;
        
    }
}