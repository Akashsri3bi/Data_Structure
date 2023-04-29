import java.util.LinkedList;
import java.util.Queue;
public class StepKnight {

      class Pair {
            int row;
            int col;
            int time;

            public Pair(int row, int col, int time) {
                  this.row = row;
                  this.col = col;
                  this.time = time;
            }
      }

      public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N) {
            boolean visited[][] = new boolean[N][N];
            int chess[][] = new int[N][N];
            int initrow = KnightPos[0] - 1;
            int initcol = KnightPos[1] - 1;
            int tarrow = TargetPos[0] - 1;
            int tarcol = TargetPos[1] - 1;

            if (initrow == tarrow && initcol == tarcol) {
                  return 0;
            }
            int res = Integer.MAX_VALUE;

            int[] deltarow = { -2, -1, 1, 2, -2, -1, 1, 2 };
            int[] deltacol = { -1, -2, -2, -1, 1, 2, 2, 1 };

            Queue<Pair> q = new LinkedList<>();
            q.add(new Pair(initrow, initcol, 0));
            visited[initrow][initcol] = true;
            while (q.isEmpty() == false) {
                  int row = q.peek().row;
                  int col = q.peek().col;
                  int time = q.peek().time;
                  if (row == tarrow && col == tarcol) {
                        res = Math.min(res, time);
                  }
                  q.remove();

                  for (int i = 0; i < 8; i++) {
                        int nrow = row + deltarow[i];
                        int ncol = col + deltacol[i];
                        if (nrow >= 0 && nrow < N && ncol >= 0 && ncol < N && visited[nrow][ncol] == false) {
                              visited[nrow][ncol] = true;
                              q.add(new Pair(nrow, ncol, time + 1));
                        }
                  }
            }

            return res;
      }
      
}
