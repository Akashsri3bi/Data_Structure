public class NumberOfEnclave {

      static void dfs(int[][] grid, int i, int j) {
            int row = grid.length;
            int col = grid[0].length;
            if (i < 0 || i >= row || j < 0 || j >= col || grid[i][j] != 1) {
                  return;
            }
            grid[i][j] = -1;
            dfs(grid, i - 1, j);
            dfs(grid, i + 1, j);
            dfs(grid, i, j - 1);
            dfs(grid, i, j + 1);
      }

      int numberOfEnclaves(int[][] grid) {
            // Your code here
            int n = grid.length;
            int m = grid[0].length;
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < m; j++) {
                        if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
                              if (grid[i][j] == 1) {
                                    dfs(grid, i, j);
                              }
                        }
                  }
            }

            int count = 0;
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < m; j++) {
                        if (grid[i][j] == 1) {
                              count++;
                        }
                  }
            }

            return count;
      }
      
}
