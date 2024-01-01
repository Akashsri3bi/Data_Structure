public class KWinSum {

      public long maxSumWithK(long arr[], long N, long K) {

            long kWinSum = 0;
            for (int i = 0; i < K; i++) {
                  kWinSum += arr[i];
            }
            // Now apply Kadane algorithm on at least K numbers.
            long currSum = kWinSum;
            long maxSum = kWinSum;
            // jth element will be added in k sum window.
            // kadane - either extend curr sum or start a new K numbers window sum.
            for (int j = (int) K, i = 0; j < N; j++, i++) {

                  kWinSum = kWinSum + arr[j] - arr[i];
                  currSum = Math.max(kWinSum, currSum + arr[j]); // extend or start a new window.
                  maxSum = Math.max(maxSum, currSum);
            }

            return maxSum;

      }
      
}
