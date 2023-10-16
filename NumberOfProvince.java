import java.util.ArrayList;

public class NumberOfProvince {

      static void dfs(ArrayList<ArrayList<Integer>> adj , int[] vis , int node){
        vis[node] = 1 ;
        for(int ele : adj.get(node)){
            if(vis[ele]!=1){
                dfs(adj , vis , ele) ; 
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>() ; 
        int n = isConnected.length ; 
        for(int i = 0 ;i<n;i++){
            adj.add(new ArrayList<>()) ; 
        }
        for(int i = 0 ;i<n;i++){
            for(int j = 0 ;j<n ; j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i) ; 
                }
            }
        }
        int[] vis = new int[n] ; 
        int count = 0 ; 
        for(int i = 0 ;i<n;i++){
            if(vis[i]!=1){
                count++;
                dfs(adj,vis,i) ; 
            }
        }
        return count ; 
    }
      
}
