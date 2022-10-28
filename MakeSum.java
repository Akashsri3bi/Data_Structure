import java.util.HashMap;

public class MakeSum {

      public static void main(String[] args) {
            int n = 5 ; //this is coming from input that you have 
            int m = 4 ; //Coming from input whose code you have written 
            int[] a = new int[n] ; 
            HashMap<Integer , Integer> map = new HashMap<>() ; 
            for(int i = 0 ; i < a.length ; i++){
                  if(map.containsKey(a[i])){
                        map.put(a[i],map.get(a[i])+1) ; 
                  }else{
                        map.put(a[i], 1) ; 
                  }
            }

            int sum = 0 ; 

            for(int i : map.keySet()){
                  if(map.get(i)<m){
                        int value = m-map.get(i) ;
                        sum+=value ; 
                  }
            }

            System.out.println(sum);

            
      }
      
}
