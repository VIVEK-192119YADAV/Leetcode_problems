// Last updated: 9/7/2025, 10:28:10 AM
class Solution {
    public int majorityElement(int[] nums) {
        int maj=nums[0];
        int v=1;
        for(int i=1;i<nums.length;i++){
            if(v==0){
                v++;
                maj=nums[i];
            }
            else if(maj==nums[i]){
                v++;
            }
            else{
                v--;
            }
        }
        return maj;
        
    }
}