public class MinPathSum {

      public int minPathSum(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int[][] dp = new int[m][n];
            for (int i = 0; i < m; i++) {
                  for (int j = 0; j < n; j++) {
                        dp[i][j] = -1;
                  }
            }
            return f(0, 0, dp, grid);
      }

      static int f(int i, int j, int[][] dp, int[][] grid) {
            if (i == grid.length - 1 && j == grid[0].length - 1) {
                  return grid[i][j];
            }
            if (i >= grid.length || j >= grid[0].length) {
                  return Integer.MAX_VALUE;
            }
            if (dp[i][j] != -1) {
                  return dp[i][j];
            }
            int up = f(i + 1, j, dp, grid);
            int down = f(i, j + 1, dp, grid);
            dp[i][j] = grid[i][j] + Math.min(up, down);
            return dp[i][j];
      }
}
