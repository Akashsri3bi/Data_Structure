import java.util.ArrayList;
import java.util.Stack;

public class Kosaraju {

//Function to find number of strongly connected components in the graph.
    private void dfs(int node ,Stack<Integer> st , boolean[] vis ,  ArrayList<ArrayList<Integer>> adj ){
        vis[node]=true ; 
        for(int neighbour : adj.get(node)){
            if(!vis[neighbour]){
                dfs(neighbour , st , vis , adj) ; 
            }
        }
        st.push(node) ;
    }
    
    private void dfs2(int node , boolean[] vis ,  ArrayList<ArrayList<Integer>> adj ){
        vis[node]=true ; 
        for(int neighbour : adj.get(node)){
            if(!vis[neighbour]){
                dfs2(neighbour ,vis , adj) ; 
            }
        }
        
    }
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
        
        boolean[] vis = new boolean[V] ; 
        Stack<Integer> st = new Stack<>();
        
        //first dfs call to store element in stack 
        
        for(int i = 0 ; i < V ; i++){
            if(!vis[i]){
                dfs(i , st , vis , adj) ; 
            }
        }
        
        //Reverse Graph step for that we need to create 
        // a new arraylist of newGraph 
        ArrayList<ArrayList<Integer>> reverseList = new ArrayList<ArrayList<Integer>> () ;
        for(int  i = 0 ; i < V ; i++){
            reverseList.add(new ArrayList<Integer>()) ; 
        }
        
        for(int i = 0 ; i < V ; i++){
            vis[i] = false ; 
            for(int neighbour : adj.get(i)){
                reverseList.get(neighbour).add(i) ; 
            }
        }
        
        int scc = 0 ; //strongly connected component 
        while(!st.isEmpty()){
            int curr = st.pop() ; 
            if(!vis[curr]){
                scc++ ; //Once dfs call is there it marks one component
                dfs2(curr ,vis , reverseList) ; 
            }
        }
        
        return scc ; //Return number of component
    }
      
}
