// Last updated: 9/2/2025, 1:30:13 PM
class Solution {
    public int search(int[] nums, int target) {
        for(int j=0;j<nums.length;j++){
            if(nums[j]==target){
                return j;
            }
             
        }
        return -1;
       

        
    }
}