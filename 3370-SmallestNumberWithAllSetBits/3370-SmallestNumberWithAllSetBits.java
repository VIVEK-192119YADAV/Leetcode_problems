// Last updated: 10/29/2025, 8:59:01 PM
class Solution {
    public int smallestNumber(int n) {
        int x = n;
        while ((x & (x + 1)) != 0){
            x++;
        }
        
        return x;
    }
}