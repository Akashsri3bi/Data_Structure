import java.util.Arrays;

public class MaxSumWithoutAdjacent {

          static int f(int i , int[] arr , int[] dp){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i] ; 
        }
        int notake = f(i+1,arr,dp) ; 
        int take = arr[i] + f(i+2,arr,dp) ; 
        dp[i] = Math.max(take,notake) ; 
        return dp[i] ;
    }
    int findMaxSum(int arr[], int n) {
        // code here
        int[] dp = new int[n] ; 
        Arrays.fill(dp,-1) ;
        return f(0,arr,dp) ; 
    }
      
}
