public class HouseRobber {

      static int f(int[] dp, int n, int[] nums) {
            if (n < 0) {
                  return 0;
            }
            if (dp[n] != -1) {
                  return dp[n];
            }
            int nottake = f(dp, n - 1, nums);
            int take = 0;
            take = nums[n] + f(dp, n - 2, nums);
            dp[n] = Math.max(take, nottake);
            return dp[n];

      }

      public int rob(int[] nums) {
            int[] dp = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                  dp[i] = -1;
            }
            return f(dp, nums.length - 1, nums);
      }
      
}
