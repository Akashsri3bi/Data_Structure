import java.util.Arrays;
import java.util.HashMap;

public class MinimumSwap {


      static void swap(int[] arr , int o , int s){
            int temp = arr[o] ; 
            arr[o] = arr[s] ; 
            arr[s] = temp ; 
      }

      

      public static int minSwaps(int nums[]){
            int ans = 0 ; 
            
            HashMap<Integer , Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                  map.put(nums[i], i);
            }
            int temp[] = Arrays.copyOf(nums , nums.length) ; 
            Arrays.sort(temp);


            for(int i = 0 ; i < nums.length ; i++){
                  if(nums[i]!=temp[i]){
                        ans++ ;  //Swap is needed 
                        int init = nums[i];

                        swap(nums , i , map.get(temp[i])) ;

                        map.put(init, map.get(temp[i])) ;
                        map.put(temp[i], i) ;

                  }
            }

            return ans ; 
      }

      public static void main(String[] args) {
            int[] nums = { 10, 19, 6, 3, 5 } ; 
            int swaps = minSwaps(nums) ;
            
            System.out.print(swaps);
      }
      
}
