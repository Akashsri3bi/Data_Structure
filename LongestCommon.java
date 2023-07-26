public class LongestCommon {

      static int solve(String s1, String s2, int i, int j, int[][] dp) {
            // base case
            if (i == s1.length()) {
                  return 0;
            }

            if (j == s2.length()) {
                  return 0;
            }
            if (dp[i][j] != -1) {
                  return dp[i][j];
            }
            int ans = 0;
            if (s1.charAt(i) == s2.charAt(j)) {
                  ans = 1 + solve(s1, s2, i + 1, j + 1, dp);
            } else {
                  ans = Math.max(solve(s1, s2, i + 1, j, dp), solve(s1, s2, i, j + 1, dp));
            }

            dp[i][j] = ans;
            return ans;
      }

      static int lcs(int x, int y, String s1, String s2) {
            // your code here
            int dp[][] = new int[x][y];
            for (int i = 0; i < x; i++) {
                  for (int j = 0; j < y; j++) {
                        dp[i][j] = -1;
                  }
            }
            return solve(s1, s2, 0, 0, dp);
      }
      
}
