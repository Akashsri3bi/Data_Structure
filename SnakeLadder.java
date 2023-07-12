import java.util.LinkedList;
import java.util.Queue;

public class SnakeLadder {

      
    public int snakesAndLadders(int[][] board) {
        int n = board.length ; 
        boolean[] visited = new boolean[n * n + 1];
        Queue<Integer> q = new LinkedList<>() ; 

        q.offer(1) ;
        visited[1] = true ; 
        int moves = 0 ; 

        while(!q.isEmpty()){
            int size = q.size() ; 
            for(int i = 0 ; i < size ; i++){
                int curr = q.poll() ;

                if(curr==n*n){
                    return moves ; 
                }

                for(int j = 1 ; j <=6 && curr+j <= n*n ; j++ ){
                    int next = curr + j ;
                    int[] coordinates = getCoordinates(next , n) ;
                    int row = coordinates[0] ;  
                    int col = coordinates[1] ;  
                    if(board[row][col]!=-1){
                        next = board[row][col] ; 
                    }

                    if(!visited[next]){
                        visited[next] = true; 
                        q.offer(next) ; 
                    }
                }
            }

            moves++ ; 
        }

        return -1 ;
    }

        private int[] getCoordinates(int square, int n) {
        int row = n - 1 - (square - 1) / n;
        int col = (row % 2 == (n % 2 == 1 ? 0 : 1)) ? (square - 1) % n : n - 1 - (square - 1) % n;
        return new int[]{row, col};
    }
      
}
