public class MotherVertex {

      static void dfs(boolean[] vis, int i, ArrayList<ArrayList<Integer>> adj) {
            vis[i] = true;
            for (int neighbour : adj.get(i)) {
                  if (!vis[neighbour]) {
                        dfs(vis, neighbour, adj);
                  }
            }
      }

      public int findMotherVertex(int V, ArrayList<ArrayList<Integer>> adj) {
            // Code here
            boolean[] vis = new boolean[V];
            int motherVertex = 0;
            for (int i = 0; i < V; i++) {
                  if (!vis[i]) {
                        dfs(vis, i, adj);
                        motherVertex = i;
                  }
            }

            boolean[] newVis = new boolean[V];
            dfs(newVis, motherVertex, adj);
            for (int i = 0; i < V; i++) {
                  if (!newVis[i]) {
                        return -1;
                  }
            }
            return motherVertex;
      }
      
}
