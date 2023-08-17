import java.util.HashMap;

public class ArrayPairSum {

       public boolean canPair(int[] nums, int k) {
      HashMap<Integer,Integer> remMap = new HashMap<>();
      // First we add the frequency of all the number inside HashMap;
      for(int val:nums){
          int rem=val%k;
          int of = remMap.getOrDefault(rem,0);
            remMap.put(rem,of+1);
      }
      
    //   Then check some constraint inside remider map with  array..
      for(int val:nums){
          int rem=val%k;
          if(rem==0){
              //if 0 then check frequncy is even or not
              int of=remMap.get(rem);
              if(of%2==1)
                return false;
          }
          else if(2*rem == k){
            //   check rem and k-rem same or not... 
            //      then check frequency even or not
               int of=remMap.get(rem);
              if(of%2==1)
                return false;
          }
          else{
              //   check rem and k-rem same or not... 
            //      then check frequency even or not
              int fq=remMap.get(rem);
              int oq=remMap.getOrDefault(k-rem,0);
              if(fq != oq){
                  return false;
              }
          }
      }
      return true;
     }
      
}
