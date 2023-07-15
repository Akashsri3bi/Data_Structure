import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite {

          public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int[] color = new int[V] ; 
        Arrays.fill(color , -1) ; 
        
        for(int i = 0 ; i < V ; i++){
            if(color[i]==-1){
                if (!isBipartiteUtil(i, color, adj)){
                    return false;
                }
            }
        }
        
        return true ; 
    }
    
    private boolean isBipartiteUtil(int node , int[] color , ArrayList<ArrayList<Integer>> adj){
        Queue<Integer> queue = new LinkedList<>() ; 
        queue.add(node); 
        color[node] = 0 ;
        
        while(!queue.isEmpty()){
            int curr = queue.poll() ; 
            for(int ngb : adj.get(curr)){
                if(color[ngb]==-1){
                    color[ngb] = 1 - color[curr] ; 
                    queue.add(ngb) ;
                }else if(color[ngb]==color[curr]){
                    return false ; 
                }
            }
        }
        
        return true ; 
    }
    
    
    
    
    
      
}
