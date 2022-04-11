import java.util.Arrays;
import java.util.HashMap;

public class IsomorphicString{
      public static boolean areIsomorphic(String str1, String str2) {
            if(str1.length()!=str2.length()){
                  return false ;
            }

            /*My APPROACH -->
            HashMap<Character , Character> map = new HashMap<>() ; 
            for(int i = 0 ; i < str1.length() ; i++){
                  if(map.containsKey(str1.charAt(i))){
                        if(map.get(str1.charAt(i))!=str2.charAt(i)){
                              return false ; 
                        }
                  }else{
                        map.put(str1.charAt(i), str2.charAt(i)) ; 
                  }
            }
            return true ; */

            Boolean[] marked = new Boolean[256] ;
            Arrays.fill(marked , Boolean.FALSE) ;
            
            int[] map = new int[256] ; 
            Arrays.fill(map, -1);

            for(int i = 0 ; i<str1.length() ; i++){
                  if(map[str1.charAt(i)]==-1){
                        if(marked[str2.charAt(i)]==true){
                              return false ; 
                        }

                        marked[str2.charAt(i)]=true ; 
                        map[str1.charAt(i)]=str2.charAt(i) ; 


                  }else if(map[str1.charAt(i)]!=str2.charAt(i)){
                        return false ; 
                  }
            }
            return true ; 
      }
}