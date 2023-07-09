import java.util.ArrayList;

public class PrerequisiteTask {

public boolean isPossible(int N,int P, int[][] prerequisites)
    {
        // Your Code goes here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>() ; 
        
        for(int i = 0 ; i < N ; i++){
            adj.add(new ArrayList<>()) ;
        }
        
        for(int[] prerequisite : prerequisites ){
            int task = prerequisite[0] ; 
            int preTask = prerequisite[1] ; 
            adj.get(task).add(preTask) ; 
            
        }
        
        int[] vis = new int[N] ;
        for(int i = 0 ;i < N ; i++){
            if(vis[i]==0 && !dfs(adj , vis , i) ){
                return false ; 
            }
        }
        
        return true ; 
    }

    
    
    
    private boolean dfs(ArrayList<ArrayList<Integer>> adj , int[] vis , int task){
        vis[task] = 1 ; 
        for(int preTask : adj.get(task)){
            if (vis[preTask]==1) {
                return false; // Cycle detected
            }
            if(vis[preTask]==0 && !dfs(adj , vis , preTask)){
                return false ; 
            }

        }
        vis[task]=2 ;
        return true ; 
    }
    
    
      
}
