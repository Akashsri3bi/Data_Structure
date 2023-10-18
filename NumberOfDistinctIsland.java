import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class NumberOfDistinctIsland {

      static void dfs(int newr , int newc , ArrayList<String> list , int[][] vis , int[][] grid , int baserow , int basecol){
        vis[newr][newc] = 1;
        list.add(toString(newr - baserow , newc - basecol)) ; 
        int n = grid.length ; 
        int m = grid[0].length ; 
        int[] drow = {1,-1,0,0} ; 
        int[] dcol = {0,0,-1,1} ; 
        for(int i = 0 ; i<4 ; i++){
            int updr = newr + drow[i] ; 
            int updc = newc + dcol[i] ; 
            if(updr>=0 && updr<n && updc>=0 && updc<m && vis[updr][updc]==0 && grid[updr][updc]==1){
                dfs(updr , updc , list , vis , grid , baserow , basecol) ; 
            }
        }
    }
    
    static String toString(int newr , int newc){
        return Integer.toString(newr) + " " + Integer.toString(newc) ; 
    }

    int countDistinctIslands(int[][] grid) {
        // Your Code here
        int n = grid.length; 
        int m = grid[0].length ; 
        int[][] vis = new int[n][m] ; 
        Set<ArrayList<String>> set = new HashSet<>() ; 
        for(int i = 0 ; i<n;i++){
            for(int j = 0 ;j<m;j++){
                if(vis[i][j]==0 && grid[i][j]==1){
                    ArrayList<String> list = new ArrayList<>() ; 
                    dfs(i,j,list,vis,grid,i,j) ; 
                    set.add(list) ; 
                }
            }
        }
        
        return set.size() ; 
        
    }
      
}
