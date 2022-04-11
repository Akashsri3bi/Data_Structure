/*
Longest Palindrome in a String 
Input:
S = "aaaabbaa"
Output: aabbaa
Explanation: The longest Palindromic
substring is "aabbaa".
*/ 

public class LongestPalin {
      static String longestPalin(String S) {
            //One solution is to check all possible substrings but i knowthats not efficient 
            int n = S.length() ;
            int start = 0 ; 
            boolean[][] table = new boolean[n][n];

            int maxlength = 1 ; 
            for(int i  = 0 ; i < n ;i++){
                  table[i][i] = true ;
            }

            //for length = 2 ;
            for(int i = 0 ; i < n-1 ; i++){
                  if(S.charAt(i)==S.charAt(i+1)){
                        table[i][i+1] = true ; 
                        maxlength = 2 ; 
                        start = i ; 
                  }
            }

            //For length 3  ,
            for(int k = 3 ; k <=n ; k++){
                  for(int i =0 ; i < n-k+1 ; i++){
                        //End index ,
                        int j = i+k-1;
                        if(table[i+1][j-1] && S.charAt(i)==S.charAt(j)){
                              table[i][j] = true ; 
                              if (k > maxlength) {
                                    start = i ;
                                    maxlength = k;
                              }
                        }
                  }
            }

            return S.substring(start,start+maxlength) ;
      }
      public static void main(String[] args) {
            
      }
      
}
