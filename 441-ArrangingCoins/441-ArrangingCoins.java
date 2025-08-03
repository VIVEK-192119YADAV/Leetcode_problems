// Last updated: 8/3/2025, 8:38:11 PM
class Solution {
    public int arrangeCoins(int n) {
        int rows=0;
        while(n>=rows+1){
            rows++;
            n-=rows;
        }
        return rows;
    }
}