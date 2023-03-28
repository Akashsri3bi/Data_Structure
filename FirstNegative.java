public class FirstNegative {

      public long[] printFirstNegativeInteger(long A[], int N, int K) {
            long[] ans = new long[N - K + 1];
            boolean flag;
            // This flag is to check negative integer number

            for (int i = 0; i < (N - K + 1); i++) {
                  flag = false;
                  for (int j = 0; j < K; j++) {
                        if (A[i + j] < 0) {
                              ans[i] = A[i + j];
                              flag = true;
                              break;
                        }
                  }

                  if (!flag) {
                        ans[i] = 0;
                  }
            }
            return ans;
      }
      
}
