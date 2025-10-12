// Last updated: 10/12/2025, 7:15:32 PM
class Solution {    
    static final int MOD = (int)1e9 + 7;
    static int[][] C = new int[31][31];
    static int[][][][] dp = new int[31][31][50][31];

    int m, k, n;

    void pascal() {
        if (C[0][0] == 1) return;
        for (int i = 1; i <= 30; i++) {
            C[i][0] = C[i][i] = 1;
            for (int j = 1; j <= i / 2; j++) {
                int Cij = C[i - 1][j - 1] + C[i - 1][j];
                C[i][j] = C[i][i - j] = Cij;
            }
        }
    }

    int popcount(int x) {
        return Integer.bitCount(x);
    }

    int dfs(int m, int k, int i, int flag, int[] nums) {
        int bz = popcount(flag);
        if (m < 0 || k < 0 || m + bz < k) return 0;
        if (m == 0) return (k == bz) ? 1 : 0;
        if (i >= n) return 0;

        if (dp[m][k][i][flag] != -1) return dp[m][k][i][flag];

        long res = 0;
        long powX = 1;
        int x = nums[i];

        for (int f = 0; f <= m; f++) { 
            long perm = (1L * C[m][f] * powX) % MOD;

            int newFlag = flag + f;
            int nextFlag = newFlag >> 1;
            boolean bitSet = (newFlag & 1) != 0;

            res = (res + perm * dfs(m - f , k - (bitSet ? 1 : 0) , i + 1 , nextFlag , nums)) % MOD;
            powX = (powX * x) % MOD;
        }

        return dp[m][k][i][flag] = (int) res;
    }


    public int magicalSum(int m, int k, int[] nums) {
        pascal();
        this.m = m;
        this.k = k;
        this.n = nums.length;

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= m; j++) {
                for (int s = 0; s < n; s++) {
                    Arrays.fill(dp[i][j][s] , -1);
                }
            }
        }
        return dfs(m , k , 0 , 0 , nums);    
    }
}

