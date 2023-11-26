public class MinInsertion {

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
                  ans = Math.max(lcs(i + 1, j, a, b, dp), lcs(i, j + 1, a, b, dp));
            }
            dp[i][j] = ans;
            return dp[i][j];
      }

      public int minInsertions(String s) {
            StringBuilder sb = new StringBuilder(s);
            String temp = sb.reverse().toString();
            int[][] dp = new int[s.length()][s.length()];
            for (int i = 0; i < s.length(); i++) {
                  for (int j = 0; j < s.length(); j++) {
                        dp[i][j] = -1;
                  }
            }
            return s.length() - lcs(0, 0, s, temp, dp);
      }
      
}
