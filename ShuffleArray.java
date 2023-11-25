public class ShuffleArray {

      void shuffleArray(long arr[], int n) {
            // Your code goes here
            int j = 0, k = n / 2;
            long[] ans = new long[n];
            for (int i = 0; i < n / 2; i++) {
                  ans[j] = arr[i];
                  j++;
                  ans[j] = arr[k];
                  j++;
                  k++;
            }
            for (int i = 0; i < n; i++) {
                  arr[i] = ans[i];
            }
      }
      
}
