// Last updated: 9/2/2025, 1:43:26 PM
class Solution {
    public int search(int[] nums, int target) {
        // for(int j=0;j<nums.length;j++){
        //     if(nums[j]==target){
        //         return j;
        //     }
             
        // }
        // return -1;
       int l=0;
       int r=nums.length-1;
       while(l<=r){
        int mid =l+(r-l)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[mid]<target){
            l=mid+1;
        }
        else {
            r=mid-1;
        }

       }
       return -1;

        
    }
}