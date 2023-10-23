public class StonesRemoved {

      static void dfs(int[][] stones, int index, boolean[] vis) {
            vis[index] = true;
            for (int i = 0; i < stones.length; i++) {
                  if (!vis[i] && (stones[index][0] == stones[i][0] || stones[index][1] == stones[i][1])) {
                        dfs(stones, i, vis);
                  }
            }
      }

      public int removeStones(int[][] stones) {
            int n = stones.length;
            boolean[] vis = new boolean[n];
            int grp = 0;
            for (int i = 0; i < n; i++) {
                  if (!vis[i]) {
                        dfs(stones, i, vis);
                        grp++;
                  }
            }
            return n - grp;
      }
      
}
