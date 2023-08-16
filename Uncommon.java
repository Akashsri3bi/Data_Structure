import java.util.HashSet;
import java.util.Set;

public class Uncommon {

          String UncommonChars(String A, String B)
    {
        // code here
        String ans = "" ; 
        Set<Character> setA = new HashSet<>() ; 
        Set<Character> setB = new HashSet<>() ; 
        
        int[] freq = new int[26] ; 
        for(int i =0 ;i<A.length();i++){
            setA.add(A.charAt(i)) ; 
        }
        
        for(int i =0 ;i<B.length();i++){
            setB.add(B.charAt(i)) ; 
        }
        
        for(char k : setA){
            if(!setB.contains(k)){
                int index = k - 97 ; 
               freq[index] = 1 ;
            }
        }
        
        for(char k : setB){
            if(!setA.contains(k)){
                int index = k - 97 ; 
               freq[index] = 1 ;
            }
        }
        
        for(int i = 0 ;i<26;i++){
            if(freq[i]==1){
                ans = ans + (char)(i+97) ; 
            }
        }
        
        if(ans==""){
            return "-1" ; 
        }else{
            return ans ; 
        }
        
       
    }
      
}
