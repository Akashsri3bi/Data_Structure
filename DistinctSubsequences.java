public class DistinctSubsequences {
      static int f(int i, int j, String s, String t, int[][] dp) {
            if (j < 0)
                  return 1;
            if (i < 0)
                  return 0;

            if (dp[i][j] != -1) {
                  return dp[i][j];
            }
            int ans = 0;
            if (s.charAt(i) == t.charAt(j)) {
                  ans = f(i - 1, j - 1, s, t, dp) + f(i - 1, j, s, t, dp);
            } else {
                  ans = f(i - 1, j, s, t, dp);
            }
            dp[i][j] = ans;
            return dp[i][j];
      }

      public int numDistinct(String s, String t) {
            int[][] dp = new int[s.length()][t.length()];
            for (int i = 0; i < s.length(); i++) {
                  for (int j = 0; j < t.length(); j++) {
                        dp[i][j] = -1;
                  }
            }
            return f(s.length() - 1, t.length() - 1, s, t, dp);
      }
      
}
