// Last updated: 8/3/2025, 8:38:05 PM
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2){
            sum +=nums[i];
        }
        return sum;
        
    }
}