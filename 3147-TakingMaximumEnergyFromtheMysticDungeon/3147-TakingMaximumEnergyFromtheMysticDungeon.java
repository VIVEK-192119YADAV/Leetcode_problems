// Last updated: 10/10/2025, 8:03:07 PM
class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int ans = Integer.MIN_VALUE;
        int dp[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            dp[i] = energy[i] + (i + k < n ? dp[i + k] : 0);
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}