public class PartitionWithDifference {

      static int mod = (int) (1e9 + 7);

      static int f(int n, int d, int[] arr, int sum, int[][] dp) {
            if (n == 0) {
                  if (sum == 0 && arr[n] == 0) {
                        return 2;
                  }
                  if (sum == 0 || sum == arr[0]) {
                        return 1;
                  }
                  return 0;
            }
            if (dp[n][sum] != -1) {
                  return dp[n][sum];
            }
            int nottake = f(n - 1, d, arr, sum, dp);
            int take = 0;
            if (sum >= arr[n]) {
                  take = f(n - 1, d, arr, sum - arr[n], dp);
            }
            dp[n][sum] = (nottake + take) % mod;
            return dp[n][sum];
      }

      public static int countPartitions(int n, int d, int[] arr) {
            int totsum = 0;
            for (int i = 0; i < n; i++) {
                  totsum += arr[i];
            }
            if (totsum - d < 0 || (totsum - d) % 2 != 0) {
                  return 0;
            }
            int target = (totsum - d) / 2;
            int[][] dp = new int[n][target + 1];
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j <= target; j++) {
                        dp[i][j] = -1;
                  }
            }
            return f(n - 1, d, arr, target, dp);
      }
      
}
