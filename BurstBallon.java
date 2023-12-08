public class BurstBallon {

      static int f(int i, int j, int[] nums, int[][] dp) {
            if (i > j) {
                  return 0;
            }
            if (dp[i][j] != -1) {
                  return dp[i][j];
            }
            int maxi = Integer.MIN_VALUE;
            for (int ind = i; ind <= j; ind++) {
                  int cost = nums[i - 1] * nums[ind] * nums[j + 1] + f(i, ind - 1, nums, dp) + f(ind + 1, j, nums, dp);
                  maxi = Math.max(maxi, cost);
            }
            dp[i][j] = maxi;
            return dp[i][j];
      }

      public int maxCoins(int[] nums) {
            int[] temp = new int[nums.length + 2];
            temp[0] = 1;
            temp[temp.length - 1] = 1;
            for (int i = 0; i < nums.length; i++) {
                  temp[i + 1] = nums[i];
            }
            int[][] dp = new int[temp.length][temp.length];
            for (int i = 0; i < temp.length; i++) {
                  Arrays.fill(dp[i], -1);
            }
            return f(1, nums.length, temp, dp);
      }
      
}
