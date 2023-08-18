import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistance {

      class Solution {
    
    static int[] r = {1, 0, -1, 0};
    static int[] c = {0, -1, 0, 1};
    
    static class Pair{
        int x;
        int y;
        int steps;
        Pair(int x, int y, int steps){
            this.x = x;
            this.y = y;
            this.steps = steps;
        }
    }
    
    int shortestDistance(int N, int M, int A[][], int X, int Y) {
        // code here
        Queue<Pair> q = new LinkedList<>();
        int steps = 0;
        boolean[][] vis = new boolean[N][M];
        
        if(A[0][0] == 0) return -1;
        else if(A[X][Y] == 0) return -1;
        
        q.add(new Pair(0, 0, 0));
        vis[0][0] = true;
        
        while(!q.isEmpty()){
            Pair point = q.poll();
            int px = point.x;
            int py = point.y;
            int step = point.steps;
            
            if(px == X && py == Y) return step;
            
            for(int i=0; i<4; i++){
                int nR = px + r[i];
                int nC = py + c[i];
                if(isValid(nR, nC, N, M) && !vis[nR][nC] && A[nR][nC] == 1){
                    q.add(new Pair(nR, nC, step+1));
                    vis[nR][nC] = true;
                }
            }
        }
        return -1;
    }
    boolean isValid(int r, int c, int N, int M){
        return (r >= 0 && c >= 0 && r< N && c<M);
    }
}
      
}
