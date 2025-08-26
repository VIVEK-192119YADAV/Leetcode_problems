// Last updated: 8/26/2025, 11:27:03 PM
class Solution {
    public int waysToSplitArray(int[] nums) {
         int count = 0;
         long arraysum=0;
         long sum =0;
         for(int i = 0 ; i<nums.length;i++){
            arraysum+=nums[i];
         }
        for(int i = 0 ; i<nums.length-1;i++){
            sum+=nums[i];
            long right = arraysum-sum;
            
            if(sum >= right){
                count++;
            }
        }
        return count;
    }
}