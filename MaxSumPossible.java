public class MaxSumPossible {

      public static int maxEqualSum(int N1, int N2, int N3, int[] S1, int[] S2, int[] S3) {
            // code here
            int sum1 = 0;
            int sum2 = 0;
            int sum3 = 0;
            for (int i : S1) {
                  sum1 += i;
            }
            for (int k : S2) {
                  sum2 += k;
            }
            for (int j : S3) {
                  sum3 += j;
            }

            int min = Math.min(sum1, Math.min(sum2, sum3));
            int i = 0, j = 0, k = 0;
            while (i <= N1 && j <= N2 && k <= N3) {
                  if (sum1 > min) {
                        sum1 -= S1[i++];
                  }
                  if (sum2 > min) {
                        sum2 -= S2[j++];
                  }
                  if (sum3 > min) {
                        sum3 -= S3[k++];
                  }

                  if (sum1 == sum2 && sum2 == sum3) {
                        return sum1;
                  }

                  min = Math.min(sum1, Math.min(sum2, sum3));
            }
            return 0;

      }
      
}
