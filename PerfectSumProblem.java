public class PerfectSumProblem {

      static int solve(int arr[], int n, int sum, int[][] dp) {
            int mod = 1000000007;

            if (n == 0 && sum > 0) {
                  return 0;
            } else if (n == 1) {
                  if (sum == 0) {
                        if (arr[0] == 0)
                              return 2;
                        else
                              return 1;
                  } else {
                        if (arr[0] == sum) {
                              return 1;
                        } else {
                              return 0;
                        }
                  }
            } else if (n == 0 && sum == 0) {
                  return 1;
            }

            if (dp[n][sum] != -1) {
                  return dp[n][sum];
            }

            int ans = solve(arr, n - 1, sum, dp) % mod;
            if (arr[n - 1] <= sum) {
                  ans += solve(arr, n - 1, sum - arr[n - 1], dp);
                  ans = ans % mod;
            }

            dp[n][sum] = ans;
            return dp[n][sum];
      }

      public int perfectSum(int arr[], int n, int sum) {
            // Your code goes here
            int[][] dp = new int[n + 1][sum + 1];

            for (int i = 0; i <= n; i++) {
                  for (int j = 0; j <= sum; j++) {
                        dp[i][j] = -1;
                  }
            }

            return solve(arr, n, sum, dp);
      }
      
}
