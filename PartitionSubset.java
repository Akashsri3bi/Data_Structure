public class PartitionSubset {

      int totsum = 0 ;for(
      int i = 0;i<nums.length;i++)
      {
            totsum += nums[i];
      }
      int k = totsum;
      boolean[][] dp = new boolean[nums.length][k + 1];for(
      int i = 0;i<nums.length;i++)
      {
            dp[i][0] = true;
      }if(nums[0]<=k)
      {
            dp[0][nums[0]] = true;
      }for(
      int ind = 1;ind<nums.length;ind++)
      {
            for (int target = 1; target <= k; target++) {
                  boolean notTake = dp[ind - 1][target];
                  boolean take = false;
                  if (nums[ind] <= target) {
                        take = dp[ind - 1][target - nums[ind]];
                  }
                  dp[ind][target] = take || notTake;
            }
      }
      int mini = Integer.MAX_VALUE;for(
      int i = 0;i<=totsum/2;i++)
      {
            if (dp[nums.length - 1][i] == true) {
                  mini = Math.min(mini, Math.abs((totsum - i) - i));
            }
      }return mini;
      
}
