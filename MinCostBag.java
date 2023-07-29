public class MinCostBag {

      class Solution

      {

            public int minimumCost(int cost[], int N, int W)

            {

                  // Your code goes here

                  int[] dp = new int[W + 1];

                  int[] wt = new int[N];

                  for (int i = 0; i < N; i++) {

                        wt[i] = i + 1;

                  }

                  dp[0] = 0;

                  for (int bgc = 1; bgc <= W; bgc++) {

                        int min = 2147483647;

                        for (int i = 0; i < N; i++) {

                              if (wt[i] <= bgc) {

                                    int rbgc = bgc - wt[i];

                                    int rbgv = dp[rbgc];

                                    if (cost[i] != -1) {

                                          int tbgv = rbgv + cost[i];

                                          if (min > tbgv && dp[rbgc] != 2147483647) {

                                                min = tbgv;

                                          }

                                    }

                              }

                        }

                        dp[bgc] = min;

                  }

                  if (dp[W] == 2147483647) {

                        return -1;

                  } else {

                        return dp[W];

                  }

            }

      }
      
}
