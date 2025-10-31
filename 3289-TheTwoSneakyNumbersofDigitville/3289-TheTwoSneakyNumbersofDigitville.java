// Last updated: 10/31/2025, 8:10:27 AM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] a=new int[2];int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    a[c]=nums[i];
                    c++;
                }
            }
        }
        return a;
    }
}