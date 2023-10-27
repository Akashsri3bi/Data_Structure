import java.util.PriorityQueue;

public class SwinRising {

      class Tri{
    int distance; 
    int row ; 
    int col ; 
    Tri(int distance , int row ,int col){
        this.distance = distance ; 
        this.row = row ; 
        this.col = col ; 
    }
}

    public int swimInWater(int[][] grid) {
        PriorityQueue<Tri> pq = new PriorityQueue<>((x,y)-> x.distance - y.distance) ; 
        int n = grid.length ; 
        int[][] vis = new int[n][n] ; 
        for(int i = 0 ;i<n;i++){
            for(int j = 0 ;j<n;j++){
                vis[i][j] = -1 ; 
            }
        }
        int[] dr = new int[]{-1,1,0,0} ;
        int[] dc = new int[]{0,0,-1,1} ; 
        pq.add(new Tri(grid[0][0] , 0,0)) ; 
        while(!pq.isEmpty()){
            Tri curr = pq.poll() ; 
            int d = curr.distance ; 
            int row = curr.row ; 
            int col = curr.col ; 
            if(row==n-1 && col==n-1){
                return d ; 
            }
            for(int i = 0 ;i<4;i++){
                int newr = row + dr[i] ;
                int newc = col + dc[i] ; 
                if(newr>=0 && newr<n && newc>=0 && newc<n && vis[newr][newc]==-1){
                    vis[newr][newc] = 1 ;
                    pq.add(new Tri(Math.max(d,grid[newr][newc]) , newr,newc)) ;
                }
            }
        }
        return -1;

}
      
}
