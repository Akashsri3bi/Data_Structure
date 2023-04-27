import java.util.*;

public class Undirected {

      public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
            // Code here
            boolean vis[] = new boolean[V];
            for (int i = 0; i < V; i++) {
                  if (!vis[i]) {
                        if (dfs(i, adj, vis, -1))
                              return true;
                  }

            }
            return false;
      }

    public boolean dfs(int V, ArrayList<ArrayList<Integer>> adj, boolean vis[], int parent){
        vis[V]=true;
        for(Integer neighbour: adj.get(V)){
            if(!vis[neighbour]){
                if(dfs(neighbour, adj, vis, V))return true;
            }else if(parent!=neighbour){
                return true;
            }
        }
        return false;
    }
}
