import java.util.*;

public class DFSGraph {

      public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
            // Code here
            ArrayList<Integer> list = new ArrayList<>();
            int[] vis = new int[V];
            vis[0] = 1;
            list.add(0);
            traverse(list, adj, vis, 0);
            return list;
      }

      public static void traverse(ArrayList<Integer> list, ArrayList<ArrayList<Integer>> adj, int[] vis, int current) {
            for (int n : adj.get(current)) {
                  if (vis[n] == 0) {
                        list.add(n);
                        vis[n] = 1;
                        traverse(list, adj, vis, n);
                  }
            }
      }
      
}
