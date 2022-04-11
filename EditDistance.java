public class EditDistance {
      //max or min number of addition or deletion or replace to transform a given string to a particular string
      public int editDistance(String s, String t) {
            //Using Approach of Dynamic programming   
            int m = s.length() ;
            int n = t.length() ; 
            //creating a table to store results of subproblems
            int[][] dp = new int[m+1][n+1] ; 

            //Filling the dp array
            for(int i = 0 ; i<=m ; i++){
                  for(int j = 0 ; j<=n ; j++){

                        if(i==0){
                              dp[i][j] =  n ;  
                        }else if(j==0){
                              dp[i][j] = m ; 
                        }else if(s.charAt(m-1)==t.charAt(n-1)){
                              dp[i][j] = dp[i-1][j-1] ; 
                        }else{
                              dp[i][j] = 1 + Math.min(dp[i-1][j-1] //Replace
                              ,Math.min(dp[i][j-1] ,  //Insert, 
                              dp[i-1][j]  //Remove        
                  )
            );  
                        }
                  }
            }

            //Return last element of the array ;

            return dp[m][n] ; 
      }
      public static void main(String[] args) {
            
      }
      
}
