public class Surround1 {

      static boolean isValid(int r, int c, int[][] matrix) {
            int n = matrix.length;
            int m = matrix[0].length;
            if (r >= 0 && r < n && c >= 0 && c < m) {
                  return true;
            } else {
                  return false;
            }
      }

      public int Count(int[][] matrix) {
            // code here
            int ans = 0;
            int[] row = new int[] { 0, 1, 0, -1, 1, -1, 1, -1 };
            int[] col = new int[] { 1, 0, -1, 0, 1, -1, -1, 1 };

            for (int i = 0; i < matrix.length; i++) {
                  for (int j = 0; j < matrix[0].length; j++) {
                        if (matrix[i][j] == 1) {
                              int r = i;
                              int c = j;
                              int countZero = 0;

                              for (int k = 0; k < 8; k++) {
                                    int nR = r + row[k];
                                    int nC = c + col[k];
                                    if (isValid(nR, nC, matrix) && matrix[nR][nC] == 0) {
                                          countZero++;
                                    }
                              }

                              if (countZero != 0 && countZero % 2 == 0) {
                                    ans++;
                              }

                        }
                  }
            }

            return ans;

      }
      
}
