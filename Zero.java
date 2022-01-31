import java.util.ArrayList;
import java.util.Set;

//subArray with Zero Sum
public class Zero {
      
      static boolean subArrayExists(int[] arr , int n ){
            ArrayList<Integer> list = new ArrayList<>();
            int sum = 0 ; 
            boolean check = false ;
            for(int i = 0 ; i < n ; i++){
                  sum+=arr[i] ; 
                  if(list.contains(sum) || arr[i]==0 || sum==0){
                        check = true ; 
                  }
                  list.add(sum); 
            }
            return check ; 
      }
      public static void main(String[] args) {
            int[] arr = {4, 2, -3, 1 ,6};
            boolean check = subArrayExists(arr,arr.length) ;
            System.out.print(check); 

      }
      
}
