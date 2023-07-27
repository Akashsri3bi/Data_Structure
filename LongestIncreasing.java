public class LongestIncreasing {

      static int longestSubsequence(int size, int a[]) {
            // code here
            int[] dp = new int[size];
            dp[0] = 1;
            int omax = 0;
            for (int i = 1; i < size; i++) {
                  int max = 0;
                  for (int j = 0; j < i; j++) {
                        if (a[j] < a[i]) {
                              max = Math.max(dp[j], max);

                        }
                  }

                  dp[i] = max + 1;

                  omax = Math.max(dp[i], omax);
            }

            return omax;
      }
      
}
