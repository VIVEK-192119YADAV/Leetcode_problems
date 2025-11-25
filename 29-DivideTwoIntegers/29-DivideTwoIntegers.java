// Last updated: 11/25/2025, 9:00:13 AM
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == -2147483648 && divisor == -1){
            return 2147483647;
        }
        return dividend/divisor;
    }
}