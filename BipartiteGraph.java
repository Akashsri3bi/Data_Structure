import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraph {

          public boolean isBipartite(int[][] graph) {
        int[] vis = new int[graph.length] ; 
        //odd = 1 ; 
        //even = -1 ; 

        for(int i = 0 ;i<graph.length; i++){
            if(vis[i]!=0){
                continue ; 
            }
        Queue<Integer> q = new LinkedList<>() ; 
        q.add(i);
        vis[i] = 1 ;

        while(!q.isEmpty()){
            int curr = q.poll() ; 
            for(int ngb : graph[curr]){
                if(vis[ngb]==0){
                    vis[ngb] = -1*(vis[curr]) ; 
                    q.add(ngb) ; 
                }else if(vis[ngb]==vis[curr]){
                    return false;
                }
            }
        }
        }
        return true ;  

    }
      
}
