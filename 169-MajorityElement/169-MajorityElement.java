// Last updated: 8/3/2025, 8:38:43 PM
class Solution {
    public int majorityElement(int[] nums) {
      int count=0;
        int val=-1;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                val=nums[i];
                count++;
            }

            else if(val!=nums[i]){
              count--;
            }

            else if(val==nums[i]){
            count++;
        }
        }

        return(val);
}
}    
         
        