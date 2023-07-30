import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class WordBreaks {

          public static int wordBreak(String A, ArrayList<String> B )
    {
        //code here
        //We use set because the operations take constant time 
        Set<String> set = new HashSet<>(B) ; 
        int n = A.length() ; 
        boolean[] dp = new boolean[n+1] ;
        dp[0] = true ;
        
        for(int i = 1 ; i<=n ; i++){
            boolean isSegmented = false ;
            for(int j = 0 ; j<i ; j++){
                if(dp[j] && set.contains(A.substring(j,i))){
                    isSegmented = true ;
                    //After this we don't need to proceed further
                    break;
                }
            }
            dp[i] = isSegmented ; 
        }
        
        return dp[n]?1 : 0 ;
        
    }
      
}
