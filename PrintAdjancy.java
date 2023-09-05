public class PrintAdjancy {

          public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> ans = new ArrayList<>() ; 
        for(int i = 0 ;i<V ; i++){
            List<Integer> temp = new ArrayList<>() ; 
            ans.add(temp) ; 
        }
        
        for(int i = 0 ; i<edges.length ; i++){
            int first = edges[i][0] ; 
            int second = edges[i][1] ; 
            
            ans.get(first).add(second) ; 
            ans.get(second).add(first) ;
        }
        
        return ans ; 
        
    }
      
}
