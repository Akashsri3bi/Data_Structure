public class OptimalStrategy {

      static int solve(int i, int j, int[] arr, int[][] dp) {
            if (j - i == 1) {
                  return Math.max(arr[i], arr[j]);
            }
            if (dp[i][j] != -1) {
                  return dp[i][j];
            }

            int take_forward = arr[i] + Math.min(solve(i + 2, j, arr, dp), solve(i + 1, j - 1, arr, dp));
            int take_backward = arr[j] + Math.min(solve(i + 1, j - 1, arr, dp), solve(i, j - 2, arr, dp));

            dp[i][j] = Math.max(take_forward, take_backward);
            return dp[i][j];
      }

      static long countMaximum(int arr[], int n) {
            // Your code here
            int[][] dp = new int[n][n];
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < n; j++) {
                        dp[i][j] = -1;
                  }
            }

            return solve(0, n - 1, arr, dp);
      }
      
}
