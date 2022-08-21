import java.util.HashMap;

public class ZeroSumSubArray {

      public static long findSubarray(long[] arr, int n) {
            HashMap<Long , Integer> map = new HashMap<>() ;
            long sum = 0 ; 
            long result = 0 ; 
            for(int i = 0 ; i<n ; i++){
                  sum+=arr[i] ; 

                  if(sum==0) result ++ ; 
                  if(map.containsKey(sum)){
                        result+= map.get(sum) ; 
                        map.put(sum, map.get(sum)+1) ; 
                  }else{
                        map.put(sum, 1) ;
                  }
            }

            return result ; 
      }

      public static void main(String[] args) {
            
      }
      
}
