import java.util.LinkedList;
import java.util.Queue;
class Pair{
    int r ; 
    int c ;
    Pair(int r , int c){
        this.r = r ; 
        this.c = c ; 

    }
}
public class FindPath {

          static boolean isValid(int r , int c , int n){
        if(r>=0 && r<n && c>=0 && c<n){
            return true ;
        }else{
            return false ;
        }
    }
    public boolean is_Possible(int[][] grid)
    {
        // Code here
        
        //First we need to find source and destination
        int r = grid.length ; 
        int c = grid[0].length ; 
        int[] source = new int[]{-1,-1} ; 
        int[] destination = new int[]{-1,-1} ;
        
        
        for(int i = 0 ; i<r ; i++){
            for(int j = 0 ;j<c ; j++){
                if(grid[i][j]==2){
                    destination[0] = i ; 
                    destination[1] = j ; 
                }else if(grid[i][j]==1){
                    source[0] = i ; 
                    source[1] = j ; 
                }
            }
        }
        
        int[] row = new int[]{-1,0,1,0} ; 
        int[] col = new int[]{0,1,0,-1};
        
        if(source[0]==destination[0] && source[1]==destination[1]){
            return true; 
        }
        
        boolean[][] vis = new boolean[r][c] ;
        Queue<Pair> q = new LinkedList<>() ; 
        q.add(new Pair(source[0],source[1])) ;
        vis[source[0]][source[1]] = true ; 
        
        
        while(!q.isEmpty()){
            Pair p = q.poll(); 
            if(p.r==destination[0] && p.c == destination[1]){
                return true ; 
            }
            for(int i = 0;i<4;i++){
                int nR = p.r + row[i] ; 
                int nC = p.c + col[i] ; 
                if(isValid(nR,nC,r) && !vis[nR][nC] && grid[nR][nC]!=0){
                    q.add(new Pair(nR,nC)) ; 
                    vis[nR][nC] = true ; 
                }
            }
        }
        return false ;
    }
      
}
