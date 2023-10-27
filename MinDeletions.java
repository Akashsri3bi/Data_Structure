public class MinDeletions {

          static int f(String s , String l , int i , int j,int[][] dp){
        if(i<0 || j<0){
            return 0 ; 
        }
        if(dp[i][j]!=-1){
            return dp[i][j] ; 
        }
        if(s.charAt(i)==l.charAt(j)){
            dp[i][j] = 1 + f(s,l,i-1,j-1,dp) ; 
        }else{
            dp[i][j] = Math.max(f(s,l,i-1,j,dp) , f(s,l,i,j-1,dp)) ; 
        }
        return dp[i][j];
    }
    static int minimumNumberOfDeletions(String S){
        //your code here
        int n = S.length() ; 
        StringBuilder sb = new StringBuilder(S) ; 
        int[][] dp = new int[n][n] ; 
        for(int i = 0 ;i<n;i++){
            for(int j = 0 ;j<n;j++){
                dp[i][j] = -1 ;
            }
        }
        return n - f(S,sb.reverse().toString(),n-1,n-1,dp) ; 
    }
      
}
