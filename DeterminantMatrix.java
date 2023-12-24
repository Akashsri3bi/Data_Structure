public class DeterminantMatrix {

      static int determinantOfMatrix(int matrix[][], int n) {

            if (n == 1) {
                  return matrix[0][0];
            } else if (n == 2) {
                  return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
            }

            int ans = 0;
            int sign = 1;
            for (int col = 0; col < n; col++) {
                  int ele = matrix[0][col] * sign;
                  sign = -sign;
                  int[][] smaller_matrix = new int[n - 1][n];
                  int m = 0;
                  for (int i = 1; i < n; i++) {
                        int[] row = new int[n];
                        int l = 0;
                        for (int j = 0; j < n; j++) {
                              if (j != col) {
                                    row[l] = matrix[i][j];
                                    l++;
                              }
                        }
                        smaller_matrix[m] = row;
                        m++;
                  }
                  int det = determinantOfMatrix(smaller_matrix, n - 1);
                  ans += det * ele;
            }
            return ans;

      }
      
}
