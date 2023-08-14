public class Max1Row {

      static int binaryCount(int[] arr, int n, int target) {
            int low = 0;
            int high = n - 1;
            while (low <= high) {
                  int mid = low + (high - low) / 2;
                  if (arr[mid] == target) {
                        high = mid - 1;
                  } else {
                        low = mid + 1;
                  }
            }
            return n - low;
      }

      public static int maxOnes(int Mat[][], int n, int m) {
            // your code here
            int maxCount = Integer.MIN_VALUE;
            int ans = 0;

            for (int i = 0; i < n; i++) {
                  int count = binaryCount(Mat[i], m, 1);
                  if (count > maxCount) {
                        ans = i;
                        maxCount = count;
                  }
            }

            return ans;
      }
      
}
