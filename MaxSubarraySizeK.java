import java.util.ArrayList;

public class MaxSubarraySizeK {

      static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        long sum = 0 ;
        for(int i = 0;i<K;i++){
            sum+=Arr.get(i) ; 
        }
        long max = sum ; 
        int i = 0 ;
        int j = K;
        while(j<N){
            sum = sum - Arr.get(i) ; 
            sum = sum + Arr.get(j) ; 
            max = Math.max(max , sum) ; 
            j++;
            i++;
        }
        return max ;
    }
      
}
