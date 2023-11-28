public class EditDistances {
      static int f(int i, int j, String a, String b, int[][] dp) {
            if (i < 0) {
                  return j + 1;
            }
            if (j < 0) {
                  return i + 1;
            }
            if (dp[i][j] != -1) {
                  return dp[i][j];
            }
            int ans = 0;
            if (a.charAt(i) == b.charAt(j)) {
                  ans = 0 + f(i - 1, j - 1, a, b, dp);
            } else {
                  ans = 1 + Math.min(f(i, j - 1, a, b, dp), Math.min(f(i - 1, j, a, b, dp), f(i - 1, j - 1, a, b, dp)));
            }
            dp[i][j] = ans;
            return dp[i][j];
      }

      public int minDistance(String word1, String word2) {
            int n = word1.length();
            int m = word2.length();
            int[][] dp = new int[n][m];
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < m; j++) {
                        dp[i][j] = -1;
                  }
            }
            return f(n - 1, m - 1, word1, word2, dp);
      }
      
}
