public class UnboundedKnapsacks {

      static int f(int n, int w, int[] profit, int[] weight, int[][] dp) {
            if (n == 0) {
                  if (w % weight[n] == 0) {
                        return profit[n] * (w / weight[n]);
                  }
                  return 0;
            }
            if (dp[n][w] != -1) {
                  return dp[n][w];
            }
            int nottake = f(n - 1, w, profit, weight, dp);
            int take = 0;
            if (w >= weight[n]) {
                  take = profit[n] + f(n, w - weight[n], profit, weight, dp);
            }
            dp[n][w] = Math.max(take, nottake);
            return dp[n][w];
      }

      public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
            // Write your code here
            int[][] dp = new int[n][w + 1];
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j <= w; j++) {
                        dp[i][j] = -1;
                  }
            }
            return f(n - 1, w, profit, weight, dp);

      }
      
}
