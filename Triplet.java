import java.util.Arrays;
import java.util.HashMap;

//find Triplet in an array whose sum equals a given number
public class Triplet {

      public static boolean find3Numbers(int A[], int n, int X) {
            HashMap<Integer , Integer> map = new HashMap<>();
            boolean found = false  ; 
            Arrays.sort(A);
            for(int i = 0 ; i < n ; i++){
                  for(int  j = 1 ; j < n ; j++){
                        if(map.containsKey(X-(A[i]+A[j]))){
                              found = true ; 
                        }
                        map.put(A[i]+A[j], i+j);
                  }
            }
            return found ; 
      }
      
      public static void main(String[] args) {
            int[] arr =  {834 ,239 ,912 ,253 ,464 ,509 ,150 ,89 ,246 ,232, 921 ,107 ,272, 369 ,422 ,259 ,158 ,648 ,983};
            System.out.println(find3Numbers(arr, arr.length, 13));
      }
      
}
