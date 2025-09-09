// Last updated: 9/9/2025, 10:43:32 PM
class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int MOD = 1000000007;

        long[] dp = new long[n + 1];  // dp[i] = number of people who learn the secret on day i
        dp[1] = 1;  // initially, 1 person knows on day 1

        long share = 0; // how many people can share on current day

        for (int day = 2; day <= n; day++) {
            // people who become eligible to share today
            if (day - delay >= 1) {
                share = (share + dp[day - delay]) % MOD;
            }
            // people who forget today -> remove them from share
            if (day - forget >= 1) {
                share = (share - dp[day - forget] + MOD) % MOD;
            }
            // new people learn today
            dp[day] = share;
        }

        // count how many still remember at day n
        long ans = 0;
        for (int day = n - forget + 1; day <= n; day++) {
            if (day >= 1) {
                ans = (ans + dp[day]) % MOD;
            }
        }

        return (int) ans;
    }
}
