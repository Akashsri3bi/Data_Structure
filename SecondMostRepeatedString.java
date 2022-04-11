import java.util.HashMap;
import java.util.Map;

public class SecondMostRepeatedString {

      String secFrequent(String arr[], int N) {
            HashMap<String,Integer> map = new HashMap<>() ; 
            for(int i = 0 ; i<arr.length ; i++){
                  if(map.containsKey(arr[i])){
                        map.put(arr[i], map.get(arr[i])+1);
                  }else{
                        map.put(arr[i], 1) ;
                  }
            }

            int max = 0 ; 
            for(String a : map.keySet()){
                  if(map.get(a)>max){
                        max = map.get(a) ;
                  }
            }

            int sec = 0 ; 
            String str = "" ;
            for(String a : map.keySet()){
                  if(map.get(a)<max && map.get(a)>sec){
                        sec = map.get(a) ; 
                        str = a ; 
                  }
            }

            return str ; 
      }
      public static void main(String[] args) {
            
      }
      
}
