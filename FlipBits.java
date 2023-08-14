public class FlipBits {

      public static int maxOnes(int arr[], int n) {
            // Your code goes here
            int currCount = 0;
            for (int i = 0; i < n; i++) {
                  if (arr[i] == 1) {
                        currCount++;
                  }
            }

            int max = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                  if (arr[i] == 1) {
                        count--;
                  } else if (arr[i] == 0) {
                        count++;
                  }
                  max = Math.max(max, count);
                  if (count < 0) {
                        count = 0;
                  }
            }
            return max + currCount;
      }
      
}
