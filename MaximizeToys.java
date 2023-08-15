import java.util.Arrays;

public class MaximizeToys {

          static int toyCount(int N, int K, int arr[])
    {
        // code here
        Arrays.sort(arr) ;
        int count = 0 ;
        for(int i = 0 ; i < N ; i++){
            K = K - arr[i];
            if(K<0){
                return count ; 
            }
            else{
                count++;
            }
        }
        
        return count ; 
    }
      
}
