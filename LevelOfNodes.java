import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOfNodes {

      int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X)
    {
        // code here
        Queue<Pair> q = new LinkedList<>() ; 
        q.add(new Pair(0,0)) ; 
        int[] vis = new int[V] ; 
        while(!q.isEmpty()){
            int size = q.size() ; 
            Pair p = q.poll() ; 
            if(p.node==X){
                return p.level ; 
            }
            vis[p.node] = 1 ;
            for(int ngb : adj.get(p.node)){
                if(vis[ngb]==0){
                q.add(new Pair(ngb , p.level+1)) ; 
                }
            }
        }
        return -1 ; 
    }
      
}
