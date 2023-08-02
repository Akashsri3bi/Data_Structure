public class PalindromicPartition {

      //HARD ;
      static boolean isPalindrome(int i, int j, String temp) {
            while (i < j) {
                  if (temp.charAt(i) == temp.charAt(j)) {
                        i++;
                        j--;
                  } else {
                        return false;
                  }
            }

            return true;
      }

      static int solve(int i, String str, int[] dp) {
            if (i == str.length()) {
                  return 0;
            }
            if (dp[i] != -1) {
                  return dp[i];
            }

            int minCost = Integer.MAX_VALUE;
            for (int j = i; j < str.length(); j++) {

                  if (isPalindrome(i, j, str)) {
                        int cost = 1 + solve(j + 1, str, dp);
                        minCost = Math.min(cost, minCost);

                  }
            }

            dp[i] = minCost;
            return dp[i];
      }

      static int palindromicPartition(String str) {
            // code here
            int[] dp = new int[str.length()];
            for (int i = 0; i < str.length(); i++) {
                  dp[i] = -1;
            }
            return solve(0, str, dp) - 1;
      }
      
}
