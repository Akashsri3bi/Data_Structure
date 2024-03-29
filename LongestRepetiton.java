public class LongestRepetiton {

      public int LongestRepeatingSubsequence(String str) {

            String s = str;

            int ans = lcs(str, s);
            return ans;

      }

      private int lcs(String str, String s) {

            int n = str.length();
            int dp[][] = new int[n + 1][n + 1];

            for (int i = 0; i <= n; i++) {
                  for (int j = 0; j <= n; j++) {

                        if (i == 0 || j == 0) {
                              dp[i][j] = 0;
                        } else if (str.charAt(i - 1) == str.charAt(j - 1) && i != j) {
                              dp[i][j] = 1 + dp[i - 1][j - 1];
                        } else {
                              dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                        }
                  }
            }

            return dp[n][n];

      }
      
}
