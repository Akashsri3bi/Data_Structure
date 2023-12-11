import java.util.Arrays;

public class PartitionArraySum {

          static int f(int i, int k , int[] arr , int[] dp){
        if(i==arr.length){
            return 0 ; 
        }
        if(dp[i]!=-1){
            return dp[i] ; 
        }
        int len = 0 ;
        int maxi = Integer.MIN_VALUE ; 
        int maxAns = Integer.MIN_VALUE ; 
        for(int j = i;j<Math.min(arr.length , i+k);j++){
            len++;
            maxi = Math.max(maxi,arr[j]) ;
            int sum = len*maxi + f(j+1,k,arr,dp) ; 
            maxAns = Math.max(maxAns,sum) ; 
        }
        dp[i] = maxAns ;
        return dp[i] ; 
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length ; 
        int[] dp = new int[n] ;
        Arrays.fill(dp,-1) ; 
        return f(0,k,arr,dp) ;
    }
      
}
