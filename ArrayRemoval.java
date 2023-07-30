import java.util.Arrays;

public class ArrayRemoval {

      int removals(int[] arr, int n, int k) {
        // code here
        if(n==1){
            return 0 ;
        }
        Arrays.sort(arr) ; 
        int i = 0 ; int max = Integer.MIN_VALUE ; 
        for(int j = i ; j<n && i<n ;j++){
            if(arr[j]-arr[i]<=k){
                max = Math.max(max,j-i+1) ; 
            }else{
                i++ ; 
            }
        }
        
        return n - max ;
    }
      
}
