public class MinFallingSum {

      static int f(int i, int j, int n, int m, int[][] matrix, int[][] dp) {
            if (i >= n || j >= m || j < 0) {
                  return Integer.MAX_VALUE;
            }
            if (i == n - 1) {
                  if (j < m && j >= 0) {
                        return matrix[i][j];
                  } else {
                        return 0;
                  }
            }
            if (dp[i][j] != Integer.MIN_VALUE) {
                  return dp[i][j];
            }

            dp[i][j] = matrix[i][j] + Math.min(
                        Math.min(f(i + 1, j - 1, n, m, matrix, dp), f(i + 1, j, n, m, matrix, dp)),
                        f(i + 1, j + 1, n, m, matrix, dp));
            return dp[i][j];
      }

      public int minFallingPathSum(int[][] matrix) {
            int n = matrix.length;
            int m = matrix[0].length;
            int[][] dp = new int[n][m];
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < m; j++) {
                        dp[i][j] = Integer.MIN_VALUE;
                  }
            }
            int min_value = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                  min_value = Math.min(min_value, f(0, i, n, m, matrix, dp));
            }
            return min_value;
      }
      
}
