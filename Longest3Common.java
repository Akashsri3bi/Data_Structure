public class Longest3Common {

      static int solve(String a, String b, String c, int i, int j, int k, int[][][] dp) {
            if (i == a.length() || j == b.length() || k == c.length()) {
                  return 0;
            }
            if (dp[i][j][k] != -1) {
                  return dp[i][j][k];
            }
            int ans = 0;
            if (a.charAt(i) == b.charAt(j) && a.charAt(i) == c.charAt(k)) {
                  ans = 1 + solve(a, b, c, i + 1, j + 1, k + 1, dp);
            } else {
                  int ak = Math.max(solve(a, b, c, i + 1, j, k, dp), solve(a, b, c, i, j + 1, k, dp));
                  ans = Math.max(ak, solve(a, b, c, i, j, k + 1, dp));
            }

            dp[i][j][k] = ans;
            return ans;
      }

      int LCSof3(String A, String B, String C, int n1, int n2, int n3) {
            // code here
            int[][][] dp = new int[n1][n2][n3];
            for (int i = 0; i < n1; i++) {
                  for (int j = 0; j < n2; j++) {
                        for (int k = 0; k < n3; k++) {
                              dp[i][j][k] = -1;
                        }
                  }
            }

            return solve(A, B, C, 0, 0, 0, dp);

      }
      
}
