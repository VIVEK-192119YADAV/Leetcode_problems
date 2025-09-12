// Last updated: 9/12/2025, 7:29:14 PM
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int res= right;
        while(right>left){
            res=right& (right-1);
            right=res;
        }
        return res;
        
    }
}