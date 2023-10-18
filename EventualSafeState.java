public class EventualSafeState {

          List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {
        // Your code here
        List<List<Integer>> revAdj = new ArrayList<>() ;
        int[] indegree = new int[V] ; 
        for(int i = 0; i < V; i++) revAdj.add(new ArrayList<>());
        
        for(int i = 0;i<V;i++){
            for(int node : adj.get(i)){
                revAdj.get(node).add(i) ; 
                indegree[i]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>(); 
        List<Integer> ans = new ArrayList<>() ;
        
        for(int  i = 0 ;i<V;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        
        while(!q.isEmpty()){
            int curr = q.remove();
            ans.add(curr) ; 
            for(int ngb : revAdj.get(curr)){
                indegree[ngb]--;
                if(indegree[ngb]==0) q.add(ngb) ; 
            }
        }
        Collections.sort(ans) ; 
        return ans ;
    }
      
}
