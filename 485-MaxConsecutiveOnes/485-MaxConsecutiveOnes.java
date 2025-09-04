// Last updated: 9/4/2025, 10:20:50 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int k =0 ;
        int max=0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==1){
                k++;
            }else{
                max=Math.max(max,k);
                k=0;
            }

        }
        max=Math.max(max,k);
        return max;
        
    }
}