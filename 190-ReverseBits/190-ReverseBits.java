// Last updated: 9/23/2025, 8:13:06 AM
class Solution {
    public int reverseBits(int n) {
        int res=0;
        for(int i=0;i<32;i++){
            res=res<<1;
            res+=(n&1);
            n=n>>1;
        }
         return res;
        
    }
}