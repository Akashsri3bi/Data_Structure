public class RodLength {

      static int f(int[] prices, int ind, int len, int[][] dp) {
            if (ind == 0) {
                  return len * prices[0];
            }
            if (dp[ind][len] != -1) {
                  return dp[ind][len];
            }
            int notake = f(prices, ind - 1, len, dp);
            int take = Integer.MIN_VALUE;
            int rodlen = ind + 1;
            if (rodlen <= len) {
                  take = prices[ind] + f(prices, ind, len - rodlen, dp);
            }
            dp[ind][len] = Math.max(take, notake);
            return dp[ind][len];

      }

      public static int cutRod(int price[], int n) {
            // Write your code here.
            int[][] dp = new int[n][n + 1];
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j <= n; j++) {
                        dp[i][j] = -1;
                  }
            }
            return f(price, n - 1, n, dp);
      }
      
}
