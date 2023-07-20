public class CoinChange {

      long solve(int coins[], long[][] dp, int m, int n) {
            if (m == -1 && n > 0) {
                  return 0;
            }

            if (n == 0) {
                  return 1;
            }

            if (n < 0) {
                  return 0;
            }

            if (dp[m][n] != -1) {
                  return dp[m][n];
            }

            dp[m][n] = solve(coins, dp, m, n - coins[m]) + solve(coins, dp, m - 1, n);
            return dp[m][n];
      }

      public long count(int coins[], int N, int sum) {
            // code here.
            long[][] dp = new long[N][sum + 1];

            for (int i = 0; i < N; i++) {
                  for (int j = 0; j <= sum; j++) {
                        dp[i][j] = -1;
                  }
            }

            return solve(coins, dp, N - 1, sum);

      }
      
}
