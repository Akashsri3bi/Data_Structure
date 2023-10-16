import java.util.LinkedList;
import java.util.Queue;
class Node {
    int row ; 
    int col ; 
    Node(int row , int col){
        this.row = row ; 
        this.col = col ;
    }
}
public class SurroundedRegion {

          public void solve(char[][] board) {
        int n = board.length ; 
        int m = board[0].length ; 
        Queue<Node> q = new LinkedList<>() ; 
        for(int i = 0 ;i<n;i++){
            for(int j = 0 ;j<m;j++){
                if(i==0 || i==n-1 || j==0 || j==m-1){
                    if(board[i][j]=='O'){
                        q.add(new Node(i,j)) ; 
                    }
                }
            }
        }
        int[] drow = {-1,1,0,0} ; 
        int[] dcol = {0,0,1,-1} ; 

        while(!q.isEmpty()){
            Node curr = q.poll() ; 
            int row = curr.row ; 
            int col = curr.col ; 
            board[row][col] = 'Y'; 
            for(int i = 0; i<4 ; i++){
                int newR = row+drow[i] ; 
                int newC = col+dcol[i]; 
                if(newR>=0 && newR<n && newC>=0 && newC<m && board[newR][newC]=='O'){
                    q.add(new Node(newR,newC)) ; 
                }
            }
        }

        for(int i = 0 ;i<n;i++){
            for(int j = 0 ;j<m;j++){
                if(board[i][j]=='O'){
                    board[i][j] = 'X';
                }else if(board[i][j]=='Y'){
                    board[i][j] = 'O' ;
                }
            }
        }

    }
      
}
