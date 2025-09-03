// Last updated: 9/3/2025, 5:17:15 PM
class Solution {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);



        
    }
    public static void reverse(int[] nums,int s,int l){
        while(s<l){
            int temp=nums[s];
            nums[s]=nums[l];
            nums[l]=temp;
             s++;
        l--;
        }
       
    }
}