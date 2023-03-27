public class DistanceNearestCell {

      class Solution {
            // Function to find distance of nearest 1 in the grid for each cell.
            class Pair {
                  int x, y;

                  Pair(int x, int y) {
                        this.x = x;
                        this.y = y;
                  }
            }

            public boolean isValid(int x, int y, int[][] grid) {
                  return x > -1 && x < grid.length && y > -1 && y < grid[0].length;
            }

            public int[][] nearest(int[][] grid) {
                  Queue<Pair> cord = new LinkedList<>();
                  int[][] ans = new int[grid.length][grid[0].length];
                  for (int i = 0; i < grid.length; i++) {
                        for (int j = 0; j < grid[0].length; j++) {
                              if (grid[i][j] == 1) {
                                    ans[i][j] = 0;
                                    cord.add(new Pair(i, j));
                              } else {
                                    ans[i][j] = Integer.MAX_VALUE;
                              }
                        }
                  }
                  while (!cord.isEmpty()) {
                        int x = cord.peek().x;
                        int y = cord.peek().y;

                        if (isValid(x - 1, y, grid) && ans[x - 1][y] > ans[x][y] + 1) {
                              ans[x - 1][y] = ans[x][y] + 1;
                              cord.add(new Pair(x - 1, y));
                        }
                        if (isValid(x + 1, y, grid) && ans[x + 1][y] > ans[x][y] + 1) {
                              ans[x + 1][y] = ans[x][y] + 1;
                              cord.add(new Pair(x + 1, y));
                        }
                        if (isValid(x, y - 1, grid) && ans[x][y - 1] > ans[x][y] + 1) {
                              ans[x][y - 1] = ans[x][y] + 1;
                              cord.add(new Pair(x, y - 1));
                        }
                        if (isValid(x, y + 1, grid) && ans[x][y + 1] > ans[x][y] + 1) {
                              ans[x][y + 1] = ans[x][y] + 1;
                              cord.add(new Pair(x, y + 1));
                        }
                        cord.remove();
                  }
                  return ans;

            }
      }
      
}
