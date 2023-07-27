public class MaxSum {

      public int maxSumIS(int arr[], int n) {
            // code here.
            int[] dp = new int[n];
            int omax = 0;
            for (int i = 0; i < n; i++) {
                  int max = 0;
                  for (int j = 0; j < i; j++) {
                        if (arr[j] < arr[i]) {
                              if (max == 0) {
                                    max = dp[j];
                              } else if (dp[j] > max) {
                                    max = dp[j];
                              }
                        }
                  }

                  if (max == 0) {
                        dp[i] = arr[i];
                  } else {
                        dp[i] = max + arr[i];
                  }

                  omax = Math.max(omax, dp[i]);
            }
            return omax;
      }
      
}
