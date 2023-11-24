public class PrintLCS {

      public static String findLCS(int n, int m, String s1, String s2) {
            // Write your code here.
            String[][] dp = new String[n + 1][m + 1];
            return helper(n, m, s1, s2, dp);
      }

      static String helper(int n, int m, String s1, String s2, String[][] dp) {
            if (n == 0 || m == 0) {
                  return "";
            }
            if (dp[n][m] != null) {
                  return dp[n][m];
            }

            if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
                  return dp[n][m] = helper(n - 1, m - 1, s1, s2, dp) + s1.charAt(n - 1);
            } else {
                  String lcs1 = helper(n - 1, m, s1, s2, dp);
                  String lcs2 = helper(n, m - 1, s1, s2, dp);
                  dp[n][m] = (lcs1.length() > lcs2.length()) ? lcs1 : lcs2;
                  return dp[n][m];
            }
      }
      
}
