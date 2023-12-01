public class BuySellCooldown {

      static int f(int i, int[] prices, int buy, int[][] dp) {
            if (i >= prices.length) {
                  return 0;
            }
            if (dp[i][buy] != -1) {
                  return dp[i][buy];
            }
            int profit = 0;
            if (buy == 1) {
                  profit = Math.max((-prices[i] + f(i + 1, prices, 0, dp)), f(i + 1, prices, 1, dp));
            } else {
                  profit = Math.max((prices[i] + f(i + 2, prices, 1, dp)), f(i + 1, prices, 0, dp));
            }
            dp[i][buy] = profit;
            return dp[i][buy];
      }

      public int maxProfit(int[] prices) {
            int[][] dp = new int[prices.length][2];
            for (int i = 0; i < prices.length; i++) {
                  for (int j = 0; j < 2; j++) {
                        dp[i][j] = -1;
                  }
            }
            return f(0, prices, 1, dp);
      }
      
}
