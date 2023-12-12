import java.util.Arrays;

public class GoldMines {

          static int f(int i , int j , int[][] m , int[][] dp){
        if(i==m.length || j==m[0].length || i<0 || j<0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j] ; 
        }
        
        int up_d = m[i][j] + f(i-1,j+1,m,dp) ; 
        int down_d = m[i][j] +f(i+1,j+1,m,dp) ;
        int right = m[i][j] + f(i,j+1,m,dp) ; 
        int max = Math.max(up_d , Math.max(down_d,right)) ;
        dp[i][j] = max ; 
        return dp[i][j] ; 
    }
    static int maxGold(int n, int m, int M[][])
    {
        // code here
        int[][] dp = new int[n][m] ; 
        for(int i = 0 ;i<n;i++){
            Arrays.fill(dp[i],-1) ;
        }
        int maxi = Integer.MIN_VALUE ; 
        for(int i = 0;i<n;i++){
            maxi = Math.max(maxi , f(i,0,M,dp)) ; 
        }
        return maxi ;
    }
      
}
