public class SubSetsum {

      static boolean solve(int n, int target, int[] arr, int[][] dp) {
            if (target == 0) {
                  return true;
            }
            if (n == 0)
                  return (arr[0] == target);

            if (dp[n][target] != -1) {
                  if (dp[n][target] == 1) {
                        return true;
                  } else {
                        return false;
                  }
            }
            // try for both notTake and Take
            boolean notTake = solve(n - 1, target, arr, dp);
            boolean take = false;
            if (arr[n] <= target) {
                  take = solve(n - 1, target - arr[n], arr, dp);
            }

            if (notTake || take) {
                  dp[n][target] = 1;
            } else {
                  dp[n][target] = 0;
            }

            return notTake || take;

      }

      static int equalPartition(int N, int arr[]) {
            // code here
            int tot = 0;
            for (int i = 0; i < N; i++) {
                  tot += arr[i];

            }
            if (tot % 2 != 0) {
                  return 0;
            }
            int target = tot / 2;
            int[][] dp = new int[N][target + 1];

            for (int i = 0; i < N; i++) {
                  for (int j = 0; j < target + 1; j++) {
                        dp[i][j] = -1;
                  }
            }
            return solve(N - 1, target, arr, dp) ? 1 : 0;
      }
      
}
