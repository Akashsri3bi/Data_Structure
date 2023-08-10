public class CoinChanges {

      public long count(int coins[], int N, int sum) {
            // code here.
            long[] dp = new long[sum + 1];
            dp[0] = 1;
            for (int coin : coins) {
                  for (int j = coin; j <= sum; j++) {
                        dp[j] += dp[j - coin];
                  }
            }
            return dp[sum];
      }
      
}
