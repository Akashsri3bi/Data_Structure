import java.util.HashMap;

public class LongestSubstr {

          static int longestSubstrDistinctChars(String S){
        // code here
        HashMap<Character,Integer> map = new HashMap<>() ; 
        int maxCount =  0 ;
        int count =  0 ;
        int n = S.length() ; 
        int l = 0 ;
        int right = 0 ;
        while(right<n){
            if(map.containsKey(S.charAt(right))){
                l = Math.max(map.get(S.charAt(right))+1 , l ) ;
                
                 
            }
            map.put(S.charAt(right) , right) ; 
            count = right - l + 1 ;
            maxCount = Math.max(count , maxCount) ;
            right++ ;
        }
        return maxCount ; 
    }
      
}
