public class GoldMine {

      static int calculate(int i, int j, int n, int m, int[][] dp, int[][] M) {
            if (dp[i][j] != -1) {
                  return dp[i][j];
            }

            if (j == m - 1) { // Reached the last column
                  dp[i][j] = M[i][j];
                  return dp[i][j];
            }

            dp[i][j] = M[i][j];
            int a = calculate(i, j + 1, n, m, dp, M); // Move right

            if (i > 0) {
                  int b = calculate(i - 1, j + 1, n, m, dp, M); // Move diagonally up-right
                  a = Math.max(a, b);
            }

            if (i < n - 1) {
                  int c = calculate(i + 1, j + 1, n, m, dp, M); // Move diagonally down-right
                  a = Math.max(a, c);
            }

            dp[i][j] += a;
            return dp[i][j];
      }

      static int maxGold(int n, int m, int[][] M) {
            int[][] dp = new int[n][m];
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < m; j++) {
                        dp[i][j] = -1;
                  }
            }
            for (int i = 0; i < n; i++) {
                  max = Math.max(max, calculate(i, 0, n, m, dp, M));
            }
            return max;
      }
      
}
