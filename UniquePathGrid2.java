public class UniquePathGrid2 {

      public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            int m = obstacleGrid.length;
            int n = obstacleGrid[0].length;
            int[][] dp = new int[m][n];
            for (int i = 0; i < m; i++) {
                  for (int j = 0; j < n; j++) {
                        dp[i][j] = -1;
                  }
            }
            return f(m - 1, n - 1, dp, obstacleGrid);
      }

      static int f(int i, int j, int[][] dp, int[][] obstacleGrid) {
            if (i == 0 && j == 0 && obstacleGrid[i][j] == 0) {
                  return 1;
            }
            if (i < 0 || j < 0) {
                  return 0;
            }
            if (obstacleGrid[i][j] == 1) {
                  return 0;
            }
            if (dp[i][j] != -1) {
                  return dp[i][j];
            }
            int up = f(i - 1, j, dp, obstacleGrid);
            int down = f(i, j - 1, dp, obstacleGrid);
            dp[i][j] = up + down;
            return dp[i][j];
      }
      
}
