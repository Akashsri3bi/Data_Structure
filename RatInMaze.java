import java.util.* ; 
public class RatInMaze {

      public static void dfs(int i, int j, String s, int[][] m, int n, int[][] vis, ArrayList<String> list) {
            if (i < 0 || j < 0 || i >= n || j >= n) {
                  return;
            }
            if (m[i][j] == 0 || vis[i][j] == 1) {
                  return;
            }
            if (i == n - 1 && j == n - 1) {
                  list.add(s);
                  return;
            }
            vis[i][j] = 1;

            dfs(i - 1, j, s + "U", m, n, vis, list);
            dfs(i + 1, j, s + "D", m, n, vis, list);
            dfs(i, j - 1, s + "L", m, n, vis, list);
            dfs(i, j + 1, s + "R", m, n, vis, list);

            vis[i][j] = 0;

      }

      public static ArrayList<String> findPath(int[][] m, int n) {
            // Your code here;
            ArrayList<String> list = new ArrayList<>();
            int[][] vis = new int[n][n];
            if (m[0][0] == 0) {
                  return list;
            }
            if (m[n - 1][n - 1] == 0) {
                  return list;
            }

            String s = "";
            dfs(0, 0, s, m, n, vis, list);
            Collections.sort(list);
            return list;
      }
      
}
