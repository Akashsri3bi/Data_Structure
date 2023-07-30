public class SmallestSum {

      static int smallestSumSubarray(int a[], int size) {
            // your code here
            int ans = Integer.MAX_VALUE;
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                  sum += a[i];
                  if (ans > sum) {
                        ans = sum;
                  }
                  if (sum > 0) {
                        sum = 0;
                  }
            }

            return ans;

      }
      
}
