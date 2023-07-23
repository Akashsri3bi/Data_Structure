public class EditSum {

      static int find(int m, int n, String s, String t, int[][] dp) {
            if (m < 0) {
                  return n + 1;
            }
            if (n < 0) {
                  return m + 1;
            }
            if (dp[m][n] != -1) {
                  return dp[m][n];
            }
            if (s.charAt(m) == t.charAt(n)) {
                  dp[m][n] = find(m - 1, n - 1, s, t, dp);
                  return dp[m][n];
            }
            dp[m][n] = 1 + Math.min(find(m - 1, n, s, t, dp),
                        Math.min(find(m, n - 1, s, t, dp), find(m - 1, n - 1, s, t, dp)));
            return dp[m][n];

      }

      public int editDistance(String s, String t) {
            // Code here
            int m = s.length();
            int n = t.length();
            int[][] dp = new int[m][n];
            for (int i = 0; i < m; i++) {
                  for (int j = 0; j < n; j++) {
                        dp[i][j] = -1;
                  }
            }
            return find(m - 1, n - 1, s, t, dp);
      }
      
}
