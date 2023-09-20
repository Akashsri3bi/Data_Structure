import java.util.Arrays;

public class SticklerThief {

          static int f(int i , int[] arr , int[] dp ){
        if(i>=arr.length){
            return 0 ; 
        }
        if(dp[i]!=-1){
            return dp[i] ; 
        }
        
        int notTake = f(i+1,arr,dp) ; 
        int take = 0 ;
        take = arr[i] + f(i+2 , arr , dp) ; 
        dp[i] = Math.max(notTake, take) ; 
        return dp[i] ; 
    }
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int[] dp = new int[n] ;
        Arrays.fill(dp , -1) ; 
        return f(0,arr,dp) ;
    }
      
}
