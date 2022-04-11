import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class rearrangechar {
      //Rearrange characters in a string  such that no two same are adjacent

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in) ; 
            int t = sc.nextInt() ;
            
            int i = 0 ; 
            while(i<t){
                  String s = sc.next() ; 
                  int  n = s.length() ; 

                  HashMap<Character , Integer> map = new HashMap<>() ;
                  int max = 0 ;
                  
                  for(int j = 0 ; j<n ; j++){
                        if(map.containsKey(s.charAt(i))){
                              map.put(s.charAt(j), map.get(s.charAt(j))+1) ; 
                        }else{
                              map.put(s.charAt(j),1) ;
                        }
                  }

                  max = Collections.max(map.values());

                  if(max<=n-max+1){
                        System.out.println(1);
                  }else{
                        System.out.println(0);
                  }
                  i++ ; 
            }

      }
      
}
