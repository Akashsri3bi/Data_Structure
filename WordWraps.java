public class WordWraps {

      static int solve(int[] nums, int n, int k) {
            int[][] extra_space = new int[n + 1][n + 1];
            int[][] cost = new int[n + 1][n + 1];
            int[] minCost = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                  extra_space[i][i] = k - nums[i - 1];
                  for (int j = i + 1; j <= n; j++) {
                        extra_space[i][j] = extra_space[i][j - 1] - nums[j - 1] - 1;
                  }
            }

            for (int i = 1; i <= n; i++) {
                  for (int j = i; j <= n; j++) {
                        if (extra_space[i][j] < 0) {
                              cost[i][j] = Integer.MAX_VALUE;
                        } else if (j == n && extra_space[i][j] >= 0) {
                              // Since On Last Line no Cost Calculated
                              cost[i][j] = 0;
                        } else {
                              cost[i][j] = extra_space[i][j] * extra_space[i][j];
                        }
                  }
            }

            minCost[0] = 0;
            for (int j = 1; j <= n; j++) {
                  minCost[j] = Integer.MAX_VALUE;
                  for (int i = 1; i <= j; i++) {
                        if (minCost[i - 1] != Integer.MAX_VALUE && cost[i][j] != Integer.MAX_VALUE
                                    && minCost[i - 1] + cost[i][j] < minCost[j]) {
                              minCost[j] = minCost[i - 1] + cost[i][j];
                        }
                  }
            }

            return minCost[n];
      }

      public int solveWordWrap(int[] nums, int k) {
            // Code here
            int n = nums.length;
            return solve(nums, n, k);
      }
      
}
