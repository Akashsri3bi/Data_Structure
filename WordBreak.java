import java.lang.constant.DynamicCallSiteDesc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordBreak {
      public static int wordBreak(String A, ArrayList<String> B) {
            int n = A.length() ; 
            if(n==0){
                  return 1 ;
            }

            for(int i = 1 ; i <=n ; i++){
                  if(B.contains(A.substring(0,i)) && wordBreak(A.substring(i , n), B)==1){
                        return 1 ; 
                  }
            }

            return 0 ; 
      }
      public static void main(String[] args) {
            String A = "ilike";
            String[] arr = { "i", "like", "sam",
"sung", "samsung", "mobile",
"ice","cream", "icecream",
"man", "go", "mango" } ; 

ArrayList<String> B = new ArrayList<>() ;

for(int i = 0 ; i < arr.length ; i++){
      B.add(arr[i]);
}

System.out.print(wordBreak(A, B));
      }
      
}
