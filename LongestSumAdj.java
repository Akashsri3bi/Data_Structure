public class LongestSumAdj {

      static int solve(int[] arr, int n, int[] dp) {
            if (n == -1) {
                  return 0;
            }
            if (n == 0) {
                  return arr[0];
            }
            if (n == 1) {
                  return arr[0] + arr[1];
            }
            if (dp[n] != -1) {
                  return dp[n];
            }
            dp[n] = Math.max(arr[n] + arr[n - 1] + solve(arr, n - 3, dp),
                        Math.max(solve(arr, n - 1, dp), arr[n] + solve(arr, n - 2, dp)));
            return dp[n];
      }

      int findMaxSum(int arr[], int n) {
            int[] dp = new int[n];
            for (int i = 0; i < n; i++) {
                  dp[i] = -1;
            }
            return solve(arr, n - 1, dp);
      }
      
}
