public class WildcardMatching {

      static boolean f(int i, int j, String s, String p, int[][] dp) {
            if (i < 0 && j < 0) {
                  return true;
            }
            if (i >= 0 && j < 0) {
                  return false;
            }
            if (i < 0 && j >= 0) {
                  for (int k = 0; k <= j; k++) {
                        if (p.charAt(k) != '*') {
                              return false;
                        }
                  }
                  return true;
            }
            if (dp[i][j] != -1) {
                  return dp[i][j] == 1 ? true : false;
            }
            boolean ans = false;
            if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?') {
                  ans = f(i - 1, j - 1, s, p, dp);
            }
            if (p.charAt(j) == '*') {
                  ans = f(i, j - 1, s, p, dp) || f(i - 1, j, s, p, dp);
            }
            dp[i][j] = ans ? 1 : 0;
            return dp[i][j] == 1 ? true : false;
      }

      public boolean isMatch(String s, String p) {
            int n = s.length();
            int m = p.length();
            int[][] dp = new int[n][m];
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < m; j++) {
                        dp[i][j] = -1;
                  }
            }
            return f(n - 1, m - 1, s, p, dp);
      }
      
}
