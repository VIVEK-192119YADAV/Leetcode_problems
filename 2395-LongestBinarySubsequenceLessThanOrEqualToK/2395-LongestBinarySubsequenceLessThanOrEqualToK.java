// Last updated: 8/3/2025, 8:37:30 PM
class Solution {
    public int longestSubsequence(String s, int k) {
        int n = s.length();
        int count = 0;
        long value = 0;
        int power = 0; // position from the right

        // Traverse from right to left (least to most significant bit)
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                // Always safe to include '0' if total bits don't overflow 32 bits
                count++;
                if (power < 31) power++;
            } else {
                if (power < 31) {
                    long potential = value + (1L << power);
                    if (potential <= k) {
                        value = potential;
                        count++;
                        power++;
                    }
                }
            }
        }

        return count;
    }
}