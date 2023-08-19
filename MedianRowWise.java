public class MedianRowWise {

      static boolean isValid(int target, int[][] mat) {
            int count = 0;
            for (int[] arr : mat) {
                  int low = 0;
                  int high = mat[0].length - 1;

                  while (low <= high) {
                        int mid = low + (high - low) / 2;
                        if (arr[mid] <= target) {
                              low = mid + 1;
                        } else {
                              high = mid - 1;
                        }
                  }
                  count += (high + 1);

            }
            if (count >= (((mat.length * mat[0].length) / 2) + 1)) {
                  return true;
            } else {
                  return false;
            }
      }

      int median(int matrix[][], int R, int C) {
            // code here
            int low = 1;
            int high = 2000;
            int median = 0;
            while (low <= high) {
                  int mid = low + (high - low) / 2;

                  if (isValid(mid, matrix)) {
                        median = mid;
                        high = mid - 1;
                  } else {
                        low = mid + 1;
                  }
            }
            return median;
      }
      
}
