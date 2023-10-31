public class MinimalCost {

      static int f(int n, int k, int[] height, int[] dp) {
            if (n == 0) {
                  return 0;
            }
            if (dp[n] != -1) {
                  return dp[n];
            }
            int minSteps = Integer.MAX_VALUE;
            for (int j = 1; j <= k; j++) {
                  if (n - j >= 0) {
                        int jump = f(n - j, k, height, dp) + Math.abs(height[n] - height[n - j]);
                        minSteps = Math.min(minSteps, jump);
                  }
            }
            dp[n] = minSteps;
            return dp[n];
      }

      public static int minimizeCost(int n, int k, int[] height) {
            int[] dp = new int[n];
            for (int i = 0; i < n; i++) {
                  dp[i] = -1;
            }
            return f(n - 1, k, height, dp); // Start with n - 1 as the initial call
      }
      
}
