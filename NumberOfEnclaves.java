public class NumberOfEnclaves {

      int row[] = new int[] { 1, -1, 0, 0 };
      int col[] = new int[] { 0, 0, 1, -1 };

      public int numEnclaves(int[][] grid) {
            // we will first traverse only the boudaries of the matrix
            for (int i = 0; i < grid.length; i++) {
                  for (int j = 0; j < grid[0].length; j++) {
                        if (i == 0 || j == 0 || i == grid.length - 1 || j == grid[0].length - 1) {
                              if (grid[i][j] == 1) {
                                    boundary(grid, i, j);
                              }
                        }
                  }
            }
            // we use count the store total land inside the matrix
            int count = 0;
            for (int i = 1; i < grid.length - 1; i++) {
                  for (int j = 1; j < grid[0].length - 1; j++) {
                        if (grid[i][j] == 1) {
                              count++;
                        }
                  }
            }
            return count;
      }

      public void boundary(int grid[][], int i, int j) {
            // when we reach outside the boundary
            if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length - 1) {
                  return;
            }
            // if we found water(1s) then no need to traverse further
            if (grid[i][j] == 0) {
                  return;
            }
            // will first mark the land as water and then move forward in all directions
            grid[i][j] = 0;
            // this for loop will help traverse in all 4 direction
            // i.e. top,bottom,right,left
            // 1,-1,0,0 for row like i + 1,i - 1,i + 0, i + 0
            // 0,0,1,-1 for col like j + 0,j + 0,j + 1,j - 1
            // so it will come as
            // boundary(grid,i+1,j);
            // boundary(grid,i-1,j);
            // boundary(grid,i,j+1);
            // boundary(grid,i+1,j-1);
            for (int k = 0; k < 4; k++) {
                  boundary(grid, i + row[k], j + col[k]);
            }
      }
      
}
