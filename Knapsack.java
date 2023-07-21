public class Knapsack {

      static int knapSack(int W, int wt[], int val[], int n) {
            // your code here
            int[][] dp = new int[n + 1][W + 1];
            for (int r = 0; r < W + 1; r++) {
                  dp[0][r] = 0;
            }
            for (int c = 0; c < n + 1; c++) {
                  dp[c][0] = 0;
            }

            for (int item = 1; item <= n; item++) {
                  for (int capacity = 1; capacity <= W; capacity++) {
                        int maxValWithoutCurr = dp[item - 1][capacity];
                        int maxValWithCurr = 0;
                        int weightOfCurr = wt[item - 1];
                        if (capacity >= weightOfCurr) {
                              maxValWithCurr = val[item - 1];
                              int remainingCapacity = capacity - weightOfCurr;
                              maxValWithCurr += dp[item - 1][remainingCapacity];
                        }

                        dp[item][capacity] = Math.max(maxValWithoutCurr, maxValWithCurr);
                  }
            }

            return dp[n][W];

      }
      
}
