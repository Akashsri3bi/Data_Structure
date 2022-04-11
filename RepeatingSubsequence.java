public class RepeatingSubsequence {
      //To find the longest repeating subsequence in the string
      public int LongestRepeatingSubsequence(String str) {
            int n = str.length() ; 
            String x = str ; 
            int[][] longestStoringarr = new int[n+1][n+1] ;
            
            //Loop to fill our table for longest storing arr 
            
            for(int i = 1 ; i <= n ; i++){
                  //Starting from 1 because at 0 position or index of the array there will be 0 placed
                  for(int j =1 ; j <=n ; j++){
                        if(str.charAt(i-1)==x.charAt(j-1) && i!=j){
                              longestStoringarr[i][j] = 1 + longestStoringarr[i-1][j-1] ;
                        }else{
                              longestStoringarr[i][j] = Math.max(longestStoringarr[i-1][j], longestStoringarr[i][j-1]);
                        }
                  }
            }

            //returning the value of the last rows last column ; 
            return longestStoringarr[n][n] ; 
      }
      public static void main(String[] args) {
            
      }
}
