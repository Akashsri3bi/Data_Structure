import java.util.Arrays;

public class PrintLargest {
         String printLargest(String[] arr) {
        // code here
        Arrays.sort(arr, (a,b)->(a+b).compareTo(b+a));
        StringBuilder sb = new StringBuilder() ; 
        for(int i = arr.length-1 ; i>=0 ; i--){
            sb.append(arr[i]) ; 
        }
        
        return sb.toString() ;
    }
      
}
