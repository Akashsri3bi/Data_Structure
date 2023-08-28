import java.util.Arrays;

public class OptimalKeys {

          static int optimalKeys(int N){
        // code here
        
        if(N<=6){
            return N; 
        }
        
        int[] dp = new int[N+1] ;
        Arrays.fill(dp,0) ; 
        for(int i = 1 ; i<=6 ;i++){
            dp[i] = i;
        }
        
        for(int i = 7 ; i<=N;i++){
            for(int j = i-3 ; j>=1;j--){
                int curr = dp[j]*(i-j-1) ; 
                if(curr>dp[i]){
                    dp[i] = curr ; 
                }
            }
        }
        
        return dp[N] ; 
    }
      
}
