public class PartitionEqualSubsetSum {

      static boolean f(int i, int target, int[] arr, int[][] dp) {
            if (target == 0) {
                  return true;
            }
            if (i == 0) {
                  return arr[i] == target;
            }
            if (dp[i][target] != -1) {
                  return dp[i][target] == 1;
            }
            boolean notTake = f(i - 1, target, arr, dp);
            boolean take = false;
            if (target >= arr[i]) {
                  take = f(i - 1, target - arr[i], arr, dp);
            }

            dp[i][target] = (take || notTake) ? 1 : 0;
            return (take || notTake);
      }

      public boolean canPartition(int[] nums) {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                  sum += nums[i];
            }
            if (sum % 2 == 0) {
                  int[][] dp = new int[nums.length][sum + 1];
                  for (int i = 0; i < nums.length; i++) {
                        for (int j = 0; j <= sum; j++) {
                              dp[i][j] = -1;
                        }
                  }
                  return f(nums.length - 1, sum / 2, nums, dp);
            } else {
                  return false;
            }
      }
      
}
