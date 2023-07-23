public class NCR {

      static int nCr(int n, int r) {
            int MOD = 1000000007; // 10^9 + 7
            if (r > n) {
                  return 0;
            }

            int[] dp = new int[r + 1];
            dp[0] = 1;

            for (int i = 1; i <= n; i++) {
                  for (int j = Math.min(i, r); j > 0; j--) {
                        dp[j] = (dp[j] + dp[j - 1]) % MOD;
                  }
            }

            return dp[r];

      }
      
}
