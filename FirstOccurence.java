import java.util.HashSet;
import java.util.Set;

public class FirstOccurence {

          public static int minIndexChar(String str, String patt)
    {
        // Your code here
        Set<Character> set = new HashSet<>() ; 
        for(int i = 0 ;i<patt.length() ; i++){
            set.add(patt.charAt(i)) ; 
        }
        
        for(int i= 0 ;i<str.length() ;i++){
            if(set.contains(str.charAt(i))){
                return i;
            }
        }
        
        return -1;
    }
      
}
