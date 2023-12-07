public class NumberOfSubarray {

      static long countSubarrays(int a[], int n, int L, int R) {
            // Complete the function
            int left = 0;
            int right = 0;
            long count = 0;
            long res = 0;
            while (right < a.length) {
                  if (a[right] >= L && a[right] <= R) {
                        count = right - left + 1;
                        res += count;
                  } else if (a[right] < L) {
                        res += count;
                  } else {
                        left = right + 1;
                        count = 0;
                  }
                  right++;
            }
            return res;
      }
      
}
