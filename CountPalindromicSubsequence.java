public class CountPalindromicSubsequence {
      static long countPS(String str) {
            /*This approach cannot work 
            int n = str.length() ; 
            boolean[][] table = new boolean[n][n] ; 
            int maxLength = 1 ; 
            int start = 0 ; 
            int count =  0 ; 
            //For length 1 string it is surely a palindrome

            for(int i = 0 ;  i < n; i++){
                  table[i][i] = true ; 
            }

            //For length 2 String 
            for(int i = 0 ; i < n-1 ;  i++){
                  if(str.charAt(i)==str.charAt(i+1)){
                        table[i][i+1] = true ;
                        
                        maxLength = 2 ; 
                  }
            }

            //For length 3 string 
            for(int k = 3 ; k<=n ; k++){
                  for(int i = 0 ; i < n-k+1; i++){
                        //Deciding the end index 
                        int j = i+k-1 ;
                        if(table[i+1][j-1] && str.charAt(i)==str.charAt(j)){
                              table[i][j] = true ;
                              maxLength = k;
                        }
                  }
            }

            //Now counting the number of subsequence 
            for(int i = 0 ; i < n ; i++){
                  for(int j = 0  ; j < n ; j++){
                        if(table[i][j]){
                              count++ ;
                        }
                  }
            }

            return count ; */

            int n = str.length() ; 
            int[][] cps = new int[n][n] ; 
            //For length 1 string 
            for(int i = 0 ; i < n ; i ++){
                  cps[i][i] = 1 ; 
            } 

            //For Length 2 onwards 
            for(int k = 2 ; k<=n ; k++){
                  for(int i=  0 ; i <= n-k ; i++){
                        int j = i+k-1 ; 
                        if(str.charAt(i)==str.charAt(j)){
                              cps[i][j] = cps[i+1][j] + cps[i][j-1] + 1 ; 
                        }else{
                              cps[i][j] = cps[i+1][j] + cps[i][j-1] - cps[i+1][j-1] ;
                        }
                  }
            }

            return cps[0][n-1];
      }
      public static void main(String[] args) {
            String str = "abcb";
            System.out.println("Total palindromic "
                        + "subsequence are : "
                        + countPS(str));
      }
      
}
