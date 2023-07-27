public class LongestSub1 {

      static int longestSubsequence(int N, int A[]) {
            // code here
            int[] dp = new int[N];
            for (int i = 0; i < N; i++) {
                  dp[i] = 1;
            }
            if (N == 1) {
                  return 1;
            }
            int omax = -1;
            for (int i = 1; i < N; i++) {

                  for (int j = 0; j < i; j++) {
                        if (A[i] - A[j] == 1 || A[j] - A[i] == 1) {
                              dp[i] = Math.max(1 + dp[j], dp[i]);
                        }
                  }

                  omax = Math.max(dp[i], omax);
            }

            return omax;

      }
      
}
