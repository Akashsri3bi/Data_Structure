public class Grid {

      public int numIslands(char[][] grid) {
            // Code here
            if (grid == null || grid.length == 0 || grid[0].length == 0) {
                  return 0;
            }

            int islands = 0;
            int rows = grid.length;
            int cols = grid[0].length;
            for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < cols; j++) {
                        if (grid[i][j] == '1') {
                              islands++;
                              dfs(grid, i, j, rows, cols);
                        }
                  }
            }

            return islands;

      }

      private void dfs(char[][] grid, int i, int j, int rows, int cols) {
            if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] != '1') {
                  return;
            }

            grid[i][j] = 0;

            dfs(grid, i - 1, j, rows, cols);
            dfs(grid, i + 1, j, rows, cols);
            dfs(grid, i, j - 1, rows, cols);
            dfs(grid, i, j + 1, rows, cols);
            dfs(grid, i - 1, j - 1, rows, cols);
            dfs(grid, i + 1, j - 1, rows, cols);
            dfs(grid, i - 1, j + 1, rows, cols);
            dfs(grid, i + 1, j + 1, rows, cols);

      }
      
}
