public class MaxPath {

      static int solve(int i, int j, int Matrix[][], int[][] dp) {
            if (i >= Matrix.length || i < 0) {
                  return 0;
            }
            if (j >= Matrix[0].length || j < 0) {
                  return 0;
            }
            if (dp[i][j] != -1) {
                  return dp[i][j];
            }

            int right = solve(i + 1, j, Matrix, dp);
            int diagonal = solve(i + 1, j + 1, Matrix, dp);
            int backDiagonal = solve(i + 1, j - 1, Matrix, dp);

            int max = 0;
            max = Math.max(Math.max(right, diagonal), backDiagonal);
            dp[i][j] = Matrix[i][j] + max;
            return Matrix[i][j] + max;
      }

      static int maximumPath(int N, int Matrix[][]) {
            // code here
            int max = Integer.MIN_VALUE;
            int[][] dp = new int[Matrix.length][Matrix[0].length];
            for (int i = 0; i < Matrix.length; i++) {
                  for (int j = 0; j < Matrix[0].length; j++) {
                        dp[i][j] = -1;
                  }
            }
            for (int i = 0; i < Matrix[0].length; i++) {
                  max = Math.max(solve(0, i, Matrix, dp), max);
            }

            return max;
      }
      
}
