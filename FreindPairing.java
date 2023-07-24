public class FreindPairing {

      public static final int MOD = 1000000007;

      public long countFriendsPairings(int n) {
            // code here
            if (n <= 1) {
                  return 1;
            }

            long[] dp = new long[n + 1];
            dp[0] = 1;
            dp[1] = 1;

            for (int i = 2; i <= n; i++) {
                  dp[i] = (dp[i - 1] + ((i - 1) * (long) dp[i - 2]) % MOD) % MOD;
            }

            return dp[n];

      }
      
}
