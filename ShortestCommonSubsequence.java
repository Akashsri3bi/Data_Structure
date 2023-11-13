public class ShortestCommonSubsequence {
      static int lcs(int i, int j, String X, String Y, int m, int n, int[][] dp) {
            if (i >= m || j >= n) {
                  return 0;
            }
            if (dp[i][j] != -1) {
                  return dp[i][j];
            }
            int ans = 0;
            if (X.charAt(i) == Y.charAt(j)) {
                  ans = 1 + lcs(i + 1, j + 1, X, Y, m, n, dp);
            } else {
                  ans = Math.max(lcs(i + 1, j, X, Y, m, n, dp), lcs(i, j + 1, X, Y, m, n, dp));
            }
            dp[i][j] = ans;
            return dp[i][j];
      }

      public static int shortestCommonSupersequence(String X, String Y, int m, int n) {
            // Your code here
            int len = X.length() + Y.length();
            int[][] dp = new int[m][n];
            for (int i = 0; i < m; i++) {
                  for (int j = 0; j < n; j++) {
                        dp[i][j] = -1;
                  }
            }
            return len - lcs(0, 0, X, Y, m, n, dp);
      }
      
}
