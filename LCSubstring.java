public class LCSubstring {

      static int solve(int i, int j, int n, int m, String s1, String s2, int[][] dp) {
            if (i == n || j == m) {
                  return 0;
            }
            if (dp[i][j] != -1) {
                  return dp[i][j];
            }
            if (s1.charAt(i) == s2.charAt(j)) {
                  dp[i][j] = 1 + solve(i + 1, j + 1, n, m, s1, s2, dp);
                  return dp[i][j];
            }

            return 0;
      }

      int longestCommonSubstr(String S1, String S2, int n, int m) {
            // code here
            int res = 0;
            int[][] dp = new int[n + 1][m + 1];
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < m; j++) {
                        dp[i][j] = -1;
                  }
            }
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < m; j++) {
                        res = Math.max(res, solve(i, j, n, m, S1, S2, dp));
                  }
            }
            return res;
      }
      
}
