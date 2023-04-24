import java.util.*;
public class BFS {

      public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
            // Code here
            ArrayList<Integer> list = new ArrayList<Integer>();
            Queue<Integer> q = new ArrayDeque<>();
            int[] vis = new int[V];
            if (adj.size() == 0) {
                  return list;
            }
            vis[0] = 1;
            q.add(0);
            while (q.size() > 0) {
                  int popped = q.peek();
                  q.remove();
                  list.add(popped);

                  for (int i : adj.get(popped)) {
                        if (vis[i] == 0) {
                              q.add(i);
                              vis[i] = 1;
                        }
                  }
            }
            return list;
      }
      
}
