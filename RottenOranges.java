import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

      static class Pair {
            int row;
            int col;
            int ts;

            Pair(int r, int c, int ts) {
                  this.row = r;
                  this.col = c;
                  this.ts = ts;
            }
      }

      public int orangesRotting(int[][] grid) {
            // Code here
            int n = grid.length;
            int m = grid[0].length;
            Queue<Pair> q = new LinkedList<>();
            int[][] vis = new int[n][m];
            int cntfresh = 0;
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < m; j++) {
                        if (grid[i][j] == 2) {
                              q.add(new Pair(i, j, 0));
                              vis[i][j] = 2;
                        } else {
                              vis[i][j] = 0;
                        }
                        if (grid[i][j] == 1) {
                              cntfresh++;
                        }
                  }
            }

            int tm = 0;
            int[] drow = { -1, 0, 1, 0 };
            int[] dcol = { 0, 1, 0, -1 };
            int cnt = 0;
            while (!q.isEmpty()) {
                  int r = q.peek().row;
                  int c = q.peek().col;
                  int ts = q.peek().ts;
                  tm = Math.max(tm, ts);
                  q.remove();
                  for (int i = 0; i < 4; i++) {
                        int nrow = r + drow[i];
                        int ncol = c + dcol[i];
                        if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
                                    && vis[nrow][ncol] != 2 && grid[nrow][ncol] == 1) {
                              q.add(new Pair(nrow, ncol, ts + 1));
                              vis[nrow][ncol] = 2;
                              cnt++;
                        }
                  }
            }

            if (cnt != cntfresh) {
                  return -1;
            } else {
                  return tm;
            }

      }
      
}
