public class LongestPalindrome {

      static int solve(int i, int j, String s, String k, int[][] dp) {
            if (i == s.length() || j == s.length()) {
                  return 0;
            }

            if (dp[i][j] != -1) {
                  return dp[i][j];
            }
            int ans = 0;
            if (s.charAt(i) == k.charAt(j)) {
                  ans = 1 + solve(i + 1, j + 1, s, k, dp);
            } else {
                  ans = Math.max(solve(i, j + 1, s, k, dp), solve(i + 1, j, s, k, dp));
            }

            dp[i][j] = ans;
            return ans;
      }

      public int longestPalinSubseq(String S) {
            // code here
            StringBuilder s = new StringBuilder(S);
            s = s.reverse();
            int[][] dp = new int[S.length()][S.length()];
            for (int i = 0; i < S.length(); i++) {
                  for (int j = 0; j < S.length(); j++) {
                        dp[i][j] = -1;
                  }
            }
            return solve(0, 0, S, s.toString(), dp);
      }
      
}
