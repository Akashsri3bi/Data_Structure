import java.util.Arrays;

public class PartitionSubsetSum {

          static boolean f(int i , int[] arr , int sum , int[][] dp){
        if(i==arr.length){
            return false ; 
        }
        if(sum==0){
            return true; 
        }
        if(dp[i][sum]!=-1){
            return dp[i][sum]==1 ? true : false;
        }
        boolean notTake = f(i+1 , arr,sum,dp) ;
        boolean take = false ;
        if(arr[i]<=sum){
            take = f(i+1,arr,sum-arr[i],dp) ; 
        }
        
        dp[i][sum] = (take | notTake) ? 1 : 0 ;
        return take | notTake ; 
    }
    static int equalPartition(int N, int arr[])
    {
        // code here
        int sum = 0;
        for(int i = 0 ;i<N ; i++){
            sum+=arr[i] ; 
        }
        if(sum%2==0){
            // Something here mostly recursion ;
            
            
            sum = sum/2 ;
            int[][] dp = new int[N+1][sum+1] ;
            for(int i = 0 ;i<dp.length ;i++){
                Arrays.fill(dp[i] , -1);
            }
            if(f(0,arr,sum,dp)){
                return 1 ;
            }else{
                return 0;
            }
        }else{
            return 0;
        }
    }
      
}
