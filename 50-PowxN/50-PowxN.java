// Last updated: 8/3/2025, 8:39:13 PM
class Solution {
    public double myPow(double x, int n) {
     long power = n;
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double result = 1.0;
        while (power > 0) {
            if (power % 2 == 1) {  // If n is odd
                result *= x;
            }
            x *= x;  // Square x
            power /= 2;  // Divide n by 2
        }
        return result;
    }
}   
    