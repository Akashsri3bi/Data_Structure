public class MinSwaps {

      static int minimumNumberOfSwaps(String S) {

            int ans = 0  , c = 0  , n = S.length();
            for(int i = 0 ; i<n ; i++){
                  if(S.charAt(i)=='[') c++ ;
                  else{
                        c-- ; 
                        if(c<0) ans-=c ; 
                  }
            }

            return ans+c ; 
      }
      public static void main(String[] args) {
            
      }
      
}
