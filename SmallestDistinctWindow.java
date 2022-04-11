import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SmallestDistinctWindow {

      public static String findSubString(String str) {
            int n = str.length() ; 
            HashMap<Character , Integer> map = new HashMap<>() ; 
            //counting all distinct characters 
            int dist_count = 0 ; 
            for(int  i = 0 ;i < n ; i++){
                  if(map.containsKey(str.charAt(i))){
                        map.put(str.charAt(i), map.get(str.charAt(i))+1) ; 
                  }else{
                        map.put(str.charAt(i), 1) ; 
                  }
            }

            dist_count = map.size() ;
            int size = Integer.MAX_VALUE ; 
            String res= "" ; 
            
            for(int  i = 0 ; i<n ; i++){
                  int count = 0 ; 
                  int visted[] = new int[256] ; 

                  //making all the values in the given 256 array as 0 
                  for(int j = 0 ; j<256 ; j++){
                        visted[j] = 0 ; 
                  }

                  String sub_str = "" ; 

                  for(int j = i ; j<n  ; j++){
                        if(visted[str.charAt(j)]==0){
                              count++  ;
                              visted[str.charAt(j)]=1 ; 
                        }
                        sub_str+=str.charAt(j) ; 


                        //Now if count == distcount we found the required length string and we should break 
                        if(count==dist_count){
                              break ; 
                        }
                  }

                  if(sub_str.length()<size && count==dist_count){
                        res = sub_str;
                        size = res.length() ; 
                        
                  }
            }

            return res ;
      }
      public static void main(String[] args) {
            String str = "aabcbcdbca";
            System.out.println("Smallest window containing all distinct" +
                        " characters is: " + findSubString(str));
      }
      
}
