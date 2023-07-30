public class UnboundedKnapsack {

      static int knapSack(int N, int W, int val[], int wt[]) {
            // code here
            int[] dp = new int[W + 1];
            dp[0] = 0;
            for (int cap = 1; cap <= W; cap++) {
                  int max = 0;
                  for (int item = 0; item < N; item++) {
                        if (wt[item] <= cap) {
                              int currV = val[item];
                              int remV = cap - wt[item];
                              int totv = currV + dp[remV];
                              max = Math.max(totv, max);
                        }
                  }
                  dp[cap] = max;
            }

            return dp[W];
      }
      
}
