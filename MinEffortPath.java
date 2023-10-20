import java.util.Arrays;
import java.util.PriorityQueue;

class Tri {
    int row;
    int col;
    int maxEffort;

    Tri(int row, int col, int maxEffort) {
        this.row = row;
        this.col = col;
        this.maxEffort = maxEffort;
    }
}
public class MinEffortPath {

          public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        int[][] effort = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(effort[i], Integer.MAX_VALUE);
        }

        int[] dRow = {-1, 1, 0, 0};
        int[] dCol = {0, 0, -1, 1};

        PriorityQueue<Tri> pq = new PriorityQueue<>((a, b) -> a.maxEffort - b.maxEffort);
        pq.offer(new Tri(0, 0, 0));
        effort[0][0] = 0;

        while (!pq.isEmpty()) {
            Tri curr = pq.poll();
            int row = curr.row;
            int col = curr.col;
            int maxEffort = curr.maxEffort;

            for (int i = 0; i < 4; i++) {
                int newRow = row + dRow[i];
                int newCol = col + dCol[i];

                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m) {
                    int newEffort = Math.max(maxEffort, Math.abs(heights[newRow][newCol] - heights[row][col]));

                    if (newEffort < effort[newRow][newCol]) {
                        effort[newRow][newCol] = newEffort;
                        pq.offer(new Tri(newRow, newCol, newEffort));
                    }
                }
            }
        }

        return effort[n - 1][m - 1];
    }
      
}
