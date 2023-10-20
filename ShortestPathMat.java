import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathMat {

          public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]==1){
            return -1 ; 
        }
        Queue<Tri> q = new LinkedList<>() ; 
        int n = grid.length ; 
        q.add(new Tri(0,0,1)) ; 
        int[][] vis = new int[grid.length][grid.length] ; 
        int[] drow = {-1 , 1 , 1  , -1 , 1 , 0 , -1 , 0} ;
        int[] dcol = {-1 , 1 , -1 , 1 , 0 , 1 , 0 , -1} ;
        vis[0][0] = 1 ;  
        while(!q.isEmpty()){
            Tri curr = q.poll() ;
            if(curr.row == n-1 && curr.col== n-1){
                return curr.val;
            }
            
            for(int i = 0 ; i<8;i++){
                int newr = curr.row + drow[i] ; 
                int newc = curr.col + dcol[i] ;
                if(newr>=0 && newr<n && newc>=0 && newc<n && vis[newr][newc]==0 && grid[newr][newc]==0){
                    q.add(new Tri(newr,newc,curr.val+1)) ;
                    vis[newr][newc] = 1 ;  
                }
            }
        }
        return -1 ;
    }
      
}
