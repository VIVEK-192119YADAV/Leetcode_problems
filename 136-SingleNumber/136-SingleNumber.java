// Last updated: 8/3/2025, 8:38:48 PM
class Solution {
    public int singleNumber(int[] nums) {
        int result =0;
        for( int num:nums){
        result^=num;}
        return result;
        
    }
}