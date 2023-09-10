import java.util.Arrays;
import java.util.PriorityQueue;

public class MaxSumPath {

      class Cell{
    int x ; 
    int y ; 
    int distance ; 
    Cell(int x , int y , int distance){
        this.x = x ; 
        this.y = y ;
        this.distance = distance ; 
    }
}
class Solution
{
    //Function to return the minimum cost to react at bottom
	//right cell from top left cell.

    public int minimumCostPath(int[][] grid) {
       int n = grid.length ; 
       int m = grid[0].length ;
       
       int[][] dist = new int[n][m] ; 
       for(int i = 0 ;i<n;i++){
           Arrays.fill(dist[i] , Integer.MAX_VALUE) ; 
       }
       
       dist[0][0] = grid[0][0] ; 
       PriorityQueue<Cell> pq = new PriorityQueue<>((x,y)-> x.distance - y.distance) ; 
       pq.add(new Cell(0,0,dist[0][0])) ; 
       
       int[] drow = {-1,0,1,0} ; 
       int[] dcol = {0,1,0,-1} ;
       while(!pq.isEmpty()){
           Cell curr = pq.poll() ; 
           int x = curr.x; 
           int y = curr.y ; 
           int cost = curr.distance ; 
           
           for(int i = 0 ;i<4 ;i++){
               int nr = x + drow[i] ; 
               int nc = y + dcol[i] ; 
               if(nr>=0 && nr<n && nc>=0 && nc<m){
                   if(cost + grid[nr][nc] < dist[nr][nc]){
                       dist[nr][nc] = cost + grid[nr][nc] ; 
                       pq.add(new Cell(nr,nc,dist[nr][nc])) ; 
                   }
               }
           }
       }
       
       return dist[n-1][m-1] ; 
      
    
    }
      
}
