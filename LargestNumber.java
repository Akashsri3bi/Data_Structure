import java.util.Arrays;

public class LargestNumber {

        String printLargest(String[] arr) {
        // code here
        int n = arr.length ; 
        String ans= "" ; 
        Arrays.sort(arr , (X , Y)-> (X+Y).compareTo(Y+X)) ; 
        
        for(int i = n-1 ; i>=0 ;i--){
            ans = ans + arr[i] ; 
        }
        
        return ans ;
    }
      
}
