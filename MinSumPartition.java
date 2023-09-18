public class MinSumPartition {

      public int minDifference(int arr[], int n) {
            // Your code goes here
            int totSum = 0;
            for (int i = 0; i < n; i++) {
                  totSum += arr[i];
            }
            int k = totSum;
            boolean[][] dp = new boolean[n][k + 1];

            // For target 0 any subset can form this if we don't take any also
            for (int i = 0; i < n; i++) {
                  dp[i][0] = true;
            }

            if (arr[0] <= k) {
                  dp[0][arr[0]] = true;
            }

            for (int ind = 1; ind < n; ind++) {
                  for (int target = 1; target <= k; target++) {
                        boolean notTake = dp[ind - 1][target];
                        boolean take = false;
                        if (arr[ind] <= target) {
                              take = dp[ind - 1][target - arr[ind]];
                        }

                        dp[ind][target] = take | notTake;
                  }
            }

            int ans = Integer.MAX_VALUE;
            for (int i = 0; i <= totSum / 2; i++) {
                  if (dp[n - 1][i] == true) {
                        int s2 = totSum - i;
                        ans = Math.min(ans, Math.abs(s2 - i));
                  }
            }

            return ans;
      }
      
}
