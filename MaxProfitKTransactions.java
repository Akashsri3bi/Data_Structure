public class MaxProfitKTransactions {

      static int calculate(int i, int n, boolean buy, int cap, int[] stocks, int[][][] dp) {
            if (i == n) {
                  return 0;
            }

            if (cap == 0) {
                  return 0;
            }
            if (dp[i][cap][buy ? 1 : 0] != -1) {
                  return dp[i][cap][buy ? 1 : 0];
            }
            int profit = 0;

            if (buy) {
                  profit = Math.max(-stocks[i] + calculate(i + 1, n, false, cap, stocks, dp),
                              0 + calculate(i + 1, n, true, cap, stocks, dp));
            } else {
                  profit = Math.max(stocks[i] + calculate(i + 1, n, true, cap - 1, stocks, dp),
                              0 + calculate(i + 1, n, false, cap, stocks, dp));
            }
            dp[i][cap][buy ? 1 : 0] = profit;
            return profit;
      }

      static int maxProfit(int K, int N, int A[]) {
            // code here
            int[][][] dp = new int[N + 1][K + 1][2];
            for (int i = 0; i <= N; i++) {
                  for (int j = 0; j <= K; j++) {
                        for (int k = 0; k < 2; k++) {
                              dp[i][j][k] = -1;
                        }

                  }
            }
            return calculate(0, N, true, K, A, dp);
      }
      
}
