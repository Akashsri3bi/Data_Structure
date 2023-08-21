public class BeautifulMatrix {

      public static int findMinOperation(int N, int[][] matrix) {
            // code here
            int count = 0;
            int maxSum = 0;
            int ans = 0;
            int rowSum = 0;

            for (int i = 0; i < N; i++) {
                  int rsum = 0;
                  int csum = 0;

                  for (int j = 0; j < N; j++) {
                        rsum += matrix[i][j];
                        csum += matrix[j][i];
                  }
                  rowSum += rsum;
                  maxSum = Math.max(rsum, csum);
                  ans = Math.max(maxSum, ans);
            }

            count = N * ans - rowSum;
            return count;

      }
      
}
