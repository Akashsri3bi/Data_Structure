public class ChocalatePickup {

      static int f(int i, int j1, int j2, int r, int c, int[][] grid, int[][][] dp) {
            if (j1 < 0 || j1 >= c || j2 < 0 || j2 >= c) {
                  return Integer.MIN_VALUE;
            }
            if (i == r - 1) {
                  if (j1 == j2) {
                        return grid[i][j1];
                  } else {
                        return grid[i][j1] + grid[i][j2];
                  }
            }
            if (dp[i][j1][j2] != -1) {
                  return dp[i][j1][j2];
            }
            // Explore All Paths
            int maxi = Integer.MIN_VALUE;
            for (int dj1 = -1; dj1 <= 1; dj1++) {
                  for (int dj2 = -1; dj2 <= 1; dj2++) {
                        int value = 0;
                        if (j1 == j2) {
                              value = grid[i][j1];
                        } else {
                              value = grid[i][j1] + grid[i][j2];
                        }
                        value += f(i + 1, j1 + dj1, j2 + dj2, r, c, grid, dp);
                        maxi = Math.max(maxi, value);
                  }
            }
            dp[i][j1][j2] = maxi;
            return dp[i][j1][j2];

      }

      public static int maximumChocolates(int r, int c, int[][] grid) {
            // Write your code here.
            int[][][] dp = new int[r][c][c];
            for (int i = 0; i < r; i++) {
                  for (int j = 0; j < c; j++) {
                        for (int k = 0; k < c; k++) {
                              dp[i][j][k] = -1;
                        }
                  }
            }
            return f(0, 0, c - 1, r, c, grid, dp);
      }
      
}
