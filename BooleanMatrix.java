public class BooleanMatrix {

      void booleanMatrix(int matrix[][]) {
            // code here
            int n = matrix.length;
            int m = matrix[0].length;
            int[] rowFlag = new int[n];
            int[] colFlag = new int[m];

            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < m; j++) {
                        if (matrix[i][j] == 1) {
                              rowFlag[i] = 1;
                              colFlag[j] = 1;
                        }
                  }
            }

            for (int i = 0; i < n; i++) {
                  if (rowFlag[i] == 1) {
                        for (int j = 0; j < m; j++) {
                              matrix[i][j] = 1;
                        }
                  }
            }

            for (int j = 0; j < m; j++) {
                  if (colFlag[j] == 1) {
                        for (int i = 0; i < n; i++) {
                              matrix[i][j] = 1;
                        }
                  }
            }
      }
      
}
