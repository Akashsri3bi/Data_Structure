public class AllocatedStudents {

      static int countStudents(int[] A, int pages) {
            int student = 1;
            int pagesStudent = 0;
            for (int i = 0; i < A.length; i++) {
                  if (pagesStudent + A[i] <= pages) {
                        pagesStudent += A[i];
                  } else {
                        student++;
                        pagesStudent = A[i];
                  }
            }

            return student;
      }

      static int max(int[] A) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < A.length; i++) {
                  max = Math.max(max, A[i]);
            }

            return max;
      }

      static int sum(int[] A) {
            int sum = 0;
            for (int i = 0; i < A.length; i++) {
                  sum += A[i];
            }

            return sum;
      }

      public static int findPages(int[] A, int N, int M) {
            // Your code here
            if (M > N) {
                  return -1;
            }

            // Calculating pages
            int low = max(A);
            int high = sum(A);
            while (low <= high) {
                  int mid = low + (high - low) / 2;
                  int cntStudents = countStudents(A, mid);
                  if (cntStudents > M) {
                        low = mid + 1;
                  } else {
                        high = mid - 1;
                  }
            }

            return low;
      }
      
}
