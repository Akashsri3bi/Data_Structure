public class NumPath {

          static int mod = (int)(1e9) ; 
    
    long numberOfPaths(int M, int N) {
        // Code Here
        int[][] dp = new int[M][N]; 
        for(int i = 0 ;i<M;i++){
            for(int j = 0 ;j<N;j++){
                dp[i][j] = 1;
            }
        }
        for(int i = 1;i<M;i++){
            for(int j = 1;j<N;j++){
                dp[i][j] = (dp[i-1][j] + dp[i][j-1])%mod ;
            }
        }
        return dp[M-1][N-1] ; 
     }
      
}
