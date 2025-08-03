// Last updated: 8/3/2025, 8:39:28 PM
class Solution {
    public int removeElement(int[] nums, int val) {
    int index=0;
    for(int i=0;i<nums.length;i++){
        if (nums[i]!=val){
            nums[index]=nums[i];
            index++;
        }
    }
    return index;
    }
}