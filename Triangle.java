import java.util.List;

public class Triangle {

          static int f(int i , int j ,int[][] dp ,List<List<Integer>> triangle){
        int n = triangle.size() ;
         
        if(i==n-1){
            return triangle.get(i).get(j); 
        }
        if(i>=n|| j>=triangle.get(i).size()){
            return Integer.MAX_VALUE ; 
        }
        if(dp[i][j]!=-1){
            return dp[i][j] ; 
        }
        dp[i][j] = triangle.get(i).get(j) + Math.min(f(i+1, j,dp,triangle) , f(i+1,j+1,dp,triangle)) ; 
        return dp[i][j] ; 
    }
    public int minimumTotal(List<List<Integer>> triangle){
        int n = triangle.size() ; 
        int m = triangle.get(n-1).size() ;
        int[][] dp = new int[n][m] ; 
        for(int i = 0 ;i<n;i++){
            for(int j = 0 ;j<m;j++){
                dp[i][j] = -1 ;
            }
        }
        return f(0,0,dp,triangle);        
    }
      
}
