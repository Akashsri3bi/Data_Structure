import java.util.ArrayList;
import java.util.Stack;

public class TopoSort {
      static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        boolean visited[]=new boolean[V];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(i,adj,st,visited);
            }
        }
        int ans[]=new int[V];
        int i=0;
        while(!st.isEmpty()){
            ans[i++]=st.pop();
        }
        return ans;
        
        
    }
    
    
    static void dfs(int u,ArrayList<ArrayList<Integer>> adj,Stack<Integer> st,boolean visited[]){
        visited[u]=true;
        for(int v:adj.get(u)){
            if(visited[v]==false)
            dfs(v,adj,st,visited);
        }
        st.push(u);
    }
      
}
