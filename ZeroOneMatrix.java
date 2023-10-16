import java.util.LinkedList;
import java.util.Queue;


class Node{
    int row ; 
    int col ; 
    int steps ;
    Node(int row , int col , int steps){
        this.row = row ; 
        this.col = col ; 
        this.steps = steps ;
    } 
}
public class ZeroOneMatrix {

          public int[][] updateMatrix(int[][] mat) {                             
        int n = mat.length ; 
        int m = mat[0].length ; 
        int[][] vis = new int[n][m] ; 
        int[][] dist = new int[n][m] ;
        Queue<Node> q = new LinkedList<>() ; 

        for(int i = 0 ;i<n;i++){
            for(int j = 0 ;j<m;j++){
                if(mat[i][j]==0){
                    q.add(new Node(i,j,0)) ; 
                    vis[i][j] = 1 ;
                }else{
                    vis[i][j] = 0 ;
                }
            }
        }

        int[] drow = {-1,1,0,0} ; 
        int[] dcol = {0,0,1,-1} ; 
        while(!q.isEmpty()){
            Node curr = q.poll() ; 
            int row = curr.row ; 
            int col = curr.col ; 
            int steps = curr.steps ; 
            dist[row][col] = steps ; 

            for(int k = 0;k<4;k++){
                int newR = row + drow[k] ; 
                int newC = col + dcol[k] ; 
                if(newR>=0 && newR<n && newC>=0 && newC<m && vis[newR][newC]==0){
                    vis[newR][newC] = 1;
                    q.add(new Node(newR,newC,steps+1)) ; 
                }
            }
        }

        return dist ; 

    }
      
}
