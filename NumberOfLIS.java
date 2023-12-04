import java.util.Arrays;

public class NumberOfLIS {

          public int findNumberOfLIS(int[] nums) {
        int[] dp = new int[nums.length] ;
        int[] count = new int[nums.length] ; 
        Arrays.fill(dp,1) ;
        Arrays.fill(count,1) ;  
        int maxi = 1 ;
        int maxInd = 0 ;
        for(int i = 0;i<nums.length;i++){
            for(int prev= 0;prev<i;prev++){
                if(nums[prev]<nums[i]){
                    if(dp[i]==1+dp[prev]){
                        count[i]+=count[prev] ;
                    }else if(dp[i]<1+dp[prev]){
                        count[i] = count[prev] ; 
                    }
                    dp[i] = Math.max(dp[i], 1+dp[prev]) ; 
                }
            }
            maxi = Math.max(maxi,dp[i]) ;
        }
        int cout  = 0;
        for(int i = 0;i<nums.length;i++){
            if(dp[i]==maxi){
                cout+=count[i] ; 
            }
        }
        return cout ;
        
    }
      
}
