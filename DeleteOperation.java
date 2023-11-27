public class DeleteOperation {

      static int lcs(int i, int j, String a, String b, int[][] dp) {
            if (i == a.length() || j == b.length()) {
                  return 0;
            }
            if (dp[i][j] != -1) {
                  return dp[i][j];
            }
            int ans = 0;
            if (a.charAt(i) == b.charAt(j)) {
                  ans = 1 + lcs(i + 1, j + 1, a, b, dp);
            } else {
                  ans = Math.max(lcs(i, j + 1, a, b, dp), lcs(i + 1, j, a, b, dp));
            }
            dp[i][j] = ans;
            return dp[i][j];
      }

      public int minDistance(String word1, String word2) {
            int[][] dp = new int[word1.length()][word2.length()];
            for (int i = 0; i < word1.length(); i++) {
                  for (int j = 0; j < word2.length(); j++) {
                        dp[i][j] = -1;
                  }
            }
            int res = lcs(0, 0, word1, word2, dp);
            return word1.length() + word2.length() - 2 * res;
      }
      
}
