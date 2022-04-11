public class LongestPrefixSuffix {
      //Finding the longest prefix and suffix in the given string which is less then the length of string
      static int longestPrefixSuffix(String s){
            //Using KMP algorithm which uses storing the len in lps array 
            int n = s.length() ; 
            int len = 0  ; 
            
            int[] lps = new int[n]  ;
            lps[0] = 0 ; 
            int i = 1 ;
            //i will start from one character from right of the len
            while(i<n){
                  if(s.charAt(i)==s.charAt(len)){
                        len++   ; 
                        lps[i] = len ; 
                        i++ ;  //To go on next character
                  }
                  else{
                        if(len!=0){
                              len = lps[len-1] ; 
                        }else{
                              lps[i] = 0 ; 
                              i++ ; 
                        }
                  }
            }

            return lps[n-1] ; 
      }
      public static void main(String[] args) {
            String s = "abcab";
            System.out.println(longestPrefixSuffix(s));
      }
      
}
