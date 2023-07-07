import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair>{
    int wt ; 
    int v ; 
    Pair(int v , int wt){
        this.v = v ; 
        this.wt = wt ; 
        
    }
    
    public int compareTo(Pair that){
        return this.wt  - that.wt ; 
        
    }
}
public class Dijstra {



      static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        boolean[] vis = new boolean[V] ;
        PriorityQueue<Pair> q = new PriorityQueue<>() ; 
        q.add(new Pair(S , 0)) ; 
        int[] ans = new int[V] ; 
        
        Arrays.fill(ans , 10000000) ; 
        ans[S] = 0 ;
        
        while(!q.isEmpty()){
            Pair curr = q.remove() ; 
            int u = curr.v ; 
            if(vis[u]){
                continue ; 
            }
            
            vis[u] = true; 
            
            ArrayList<ArrayList<Integer>> neg = adj.get(u) ; 
            for(ArrayList<Integer> list : neg){
                int vertex = list.get(0) ; 
                int wt = list.get(1) ; 
                
                if(ans[vertex] > ans[u] + wt){
                    ans[vertex] = ans[u] + wt ; 
                    q.add(new Pair(vertex , ans[vertex]));
                }
            }
        }
        
        return ans ;
    }
      
}
