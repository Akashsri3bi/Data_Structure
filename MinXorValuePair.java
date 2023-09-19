import java.util.Arrays;

public class MinXorValuePair {

      //This is O(nlogn) solution
      static int minxorpair(int N, int arr[]){
        // code here
        int min = Integer.MAX_VALUE ; 
        Arrays.sort(arr) ;
        for(int i = 0 ;i<arr.length-1 ; i++){
            min = Math.min(min , arr[i]^arr[i+1] ); 
        }
        
        return min ; 
    }
      
}
