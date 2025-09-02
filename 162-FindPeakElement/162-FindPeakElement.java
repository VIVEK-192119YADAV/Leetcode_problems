// Last updated: 9/2/2025, 1:08:01 PM
class Solution {
    public int findPeakElement(int[] nums) {
        int b= nums[0];
        for(int i=0;i<nums.length;i++){
            if(b<nums[i]){
                b=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(b==nums[i]){
                return i;
            }
        }
        return 0;
        
    }
}