public class BBT {

      static long countBT(int h) {
            // code here

            if (h == 1 || h == 0) {
                  return 1;
            }
            long[] dp = new long[h + 1];
            dp[0] = 1;
            dp[1] = 1;
            long MOD = 1000000007;
            for (int i = 2; i <= h; i++) {
                  dp[i] = (dp[i - 1] * (2 * dp[i - 2] + dp[i - 1])) % MOD;
            }
            return dp[h];

      }
      
}
