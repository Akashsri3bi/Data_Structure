public class MatrixChain {

      static int result(int i , int j , int[] arr , int[][] dp){
        if(i==j) {
            return 0 ; 
        }
        if(dp[i][j]!=-1){
            return dp[i][j] ; 
        }
        
        int mini = Integer.MAX_VALUE ; 
        
        for(int k = i ; k<j ; k++){
            int steps = arr[i-1]*arr[k]*arr[j] + result(i,k,arr,dp) + result(k+1,j,arr,dp) ; 
            if(steps<mini){
                mini = steps ; 
            }
        }
        dp[i][j] = mini ;
        return mini ; 
    }
    static int matrixMultiplication(int N, int arr[])
    {
        // code here
        int[][] dp = new int[N][N] ; 
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                dp[i][j] = -1 ; 
            }
        }
        return result(1 , N-1 , arr , dp) ; 
    }
      
}
