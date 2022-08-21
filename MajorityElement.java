import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
      static int majorityElement(int a[], int size) {
            Arrays.sort(a);
            HashMap map = new HashMap<Integer , Integer>() ;
            for(int i = 0 ; i<size ; i++){
                  if(map.containsKey(a[i])){
                        map.put(a[i], (int)map.get(a[i]) + 1);
                        
                  }else{
                        map.put(a[i], 1) ;
                  }
            }

            int sz = size/2 ; 
            for(int i = 0 ; i<size ; i++){
                  int k = (int) map.get(a[i]);
                  if(k>sz){
                        return a[i] ;
                  }
            }

            return -1 ;
      }
      public static void main(String[] args) {
            
      }
      
}
