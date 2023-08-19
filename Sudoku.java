public class Sudoku {

      static boolean isValid(int row, int col, int k, int[][] grid) {
            for (int i = 0; i < grid.length; i++) {
                  if (grid[row][i] == k) {
                        return false;
                  }
                  if (grid[i][col] == k) {
                        return false;
                  }
                  // Check in 3X3 sub matrix
                  if (grid[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == k) {
                        return false;
                  }
            }

            return true;
      }

      static boolean SolveSudoku(int grid[][]) {
            // add your code here
            for (int i = 0; i < grid.length; i++) {
                  for (int j = 0; j < grid.length; j++) {
                        if (grid[i][j] == 0) {
                              for (int k = 1; k <= 9; k++) {
                                    if (isValid(i, j, k, grid)) {
                                          grid[i][j] = k;

                                          if (SolveSudoku(grid) == true) {
                                                return true;
                                          } else {
                                                grid[i][j] = 0;
                                          }
                                    }
                              }
                              return false;
                        }
                  }
            }

            return true;
      }

      // Function to print grids of the Sudoku.
      static void printGrid(int grid[][]) {
            // add your code here
            for (int i = 0; i < grid.length; i++) {
                  for (int j = 0; j < grid.length; j++) {
                        if (i == grid.length - 1 && j == grid.length - 1) {
                              System.out.print(grid[i][j]);
                        } else {
                              System.out.print(grid[i][j] + " ");
                        }
                  }
            }
      }
      
}
