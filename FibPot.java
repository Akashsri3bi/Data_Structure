public class FibPot {

      public static long[] printFibb(int n) {

            if (n == 0) {
                  long[] dp = new long[n];
                  dp[0] = 1;
                  return dp;
            }
            if (n == 1) {
                  long[] dp = new long[n];
                  dp[0] = 1;
                  return dp;
            }
            long[] dp = new long[n];

            dp[0] = 1;
            dp[1] = 1;

            for (int i = 2; i < n; i++) {
                  dp[i] = dp[i - 1] + dp[i - 2];
            }

            return dp;
      }
      
}
