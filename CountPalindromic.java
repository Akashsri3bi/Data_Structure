public class CountPalindromic {

      static long solve(int i, int j, String s, long[][] dp) {
            int MOD = 1000000007;
            if (i == j) {
                  dp[i][j] = 1;
                  return dp[i][j];
            }
            if (i > j) {
                  return 0;
            }
            if (dp[i][j] != -1) {
                  return dp[i][j];
            }

            if (s.charAt(i) == s.charAt(j)) {
                  dp[i][j] = (1 + solve(i + 1, j, s, dp) + solve(i, j - 1, s, dp)) % MOD;
                  return dp[i][j];
            } else {
                  dp[i][j] = (MOD + solve(i + 1, j, s, dp) + solve(i, j - 1, s, dp) - solve(i + 1, j - 1, s, dp)) % MOD;
                  return dp[i][j];
            }

      }

      long countPS(String str) {
            // Your code here

            long[][] dp = new long[str.length()][str.length()];
            for (int i = 0; i < str.length(); i++) {
                  for (int j = 0; j < str.length(); j++) {
                        dp[i][j] = -1;
                  }
            }

            return solve(0, str.length() - 1, str, dp);

      }
      
}
