import java.util.ArrayList;
import java.util.List;

//Shift 2D grid 

public class Shift2DGrid {
      public List<List<Integer>> shiftGrid(int[][] grid, int k) {

            int m = grid.length; // row
            int n = grid[0].length; // Column

            for (int l = 0; l < k; l++) {
                  int a = 0;
                  int b = 1;
                  int temp = grid[0][0];
                  for (int i = 0; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                              if (j == n - 1) {
                                    a += 1;
                                    b = 0;
                              }
                              if (a > m - 1) {
                                    a = 0;
                              }
                              int temp_2 = grid[a][b];
                              grid[a][b] = temp;
                              temp = temp_2;
                              b += 1;
                        }
                  }
            }

            List<List<Integer>> list = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                  List<Integer> sub_list = new ArrayList<>();
                  for (int j = 0; j < n; j++) {
                        sub_list.add(grid[i][j]);
                  }

                  list.add(sub_list);
            }

            return list;
      }
}