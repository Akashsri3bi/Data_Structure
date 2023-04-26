import java.util.*;
public class DetectCycle {

      public boolean isCyclicUtil(int V, ArrayList<ArrayList<Integer>> adj, int curr, boolean[] vis, boolean[] stack) {
            vis[curr] = true;
            stack[curr] = true;

            for (int i = 0; i < adj.get(curr).size(); i++) {
                  int e = adj.get(curr).get(i);
                  if (stack[e]) {
                        return true;
                  }
                  if (!vis[e] && isCyclicUtil(V, adj, e, vis, stack)) {
                        return true;
                  }
            }
            stack[curr] = false;
            return false;
      }

      public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
            // code here
            boolean[] vis = new boolean[V];
            boolean[] stack = new boolean[V];

            for (int i = 0; i < V; i++) {
                  if (!vis[i]) {
                        if (isCyclicUtil(V, adj, i, vis, stack)) {
                              return true;
                        }
                  }
            }

            return false;
      }
      
}
