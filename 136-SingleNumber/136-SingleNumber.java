// Last updated: 9/5/2025, 8:55:30 PM
class Solution {
    public int singleNumber(int[] nums) {
        int result =0;
        for( int num:nums){
        result^=num;}
        return result;
        
    }
}