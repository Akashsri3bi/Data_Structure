public class CoinChange2 {

      static int f(int ind, int amount, int[] coins, int[][] dp) {
            if (ind == 0) {
                  return amount % coins[ind] == 0 ? 1 : 0;
            }
            if (dp[ind][amount] != -1) {
                  return dp[ind][amount];
            }
            int nottake = f(ind - 1, amount, coins, dp);
            int take = 0;
            if (amount >= coins[ind]) {
                  take = f(ind, amount - coins[ind], coins, dp);
            }
            dp[ind][amount] = take + nottake;
            return dp[ind][amount];
      }

      public int change(int amount, int[] coins) {
            int[][] dp = new int[coins.length][amount + 1];
            for (int i = 0; i < coins.length; i++) {
                  for (int j = 0; j <= amount; j++) {
                        dp[i][j] = -1;
                  }
            }
            return f(coins.length - 1, amount, coins, dp);
      }
      
}
