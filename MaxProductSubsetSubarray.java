public class MaxProductSubsetSubarray {

      public static int findMaxProduct(int n, int[] arr) {
            // code here
            int zeroCount = 0;
            int negativeCount = 0;
            long prod = 1;
            int maxNegative = Integer.MIN_VALUE;
            int mod = 1000000007;
            if (n == 1) {
                  return arr[0];
            }
            for (int i = 0; i < n; i++) {
                  if (arr[i] == 0) {
                        zeroCount++;
                        continue;
                  }
                  if (arr[i] < 0) {
                        negativeCount++;
                        maxNegative = Math.max(maxNegative, arr[i]);
                  }
                  prod = (prod * arr[i]) % mod;
            }
            if (zeroCount == n) {
                  return 0;
            } else if (negativeCount == 1 && zeroCount + negativeCount == n) {
                  return 0;
            }

            else if (negativeCount % 2 == 0) {
                  return (int) prod;
            } else if (negativeCount % 2 == 1) {
                  long ans = prod / maxNegative;
                  return (int) ans;
            } else {
                  return 0;
            }

      }
      
}
