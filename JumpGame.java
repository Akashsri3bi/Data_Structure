import java.util.Arrays;

public class JumpGame {

      static boolean f(int i , int[] nums , int[] dp){
        if(i>=nums.length-1){
            return true ; 
        }
        if(nums[i]==0){
            return false;
        }
        if(dp[i]!=-1){
            return dp[i]==1?true:false ; 
        }
        boolean isPossible = false;
        for(int k = 1;k<=nums[i];k++){
            isPossible = f(i+k,nums,dp) ;
            if(isPossible){
                return true ;
            }
        }
        dp[i] = isPossible?1:0 ;
        return dp[i]==1?true:false ; 
    }
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int[] dp = new int[nums.length]; 
        Arrays.fill(dp,-1) ; 
        return f(0,nums,dp) ; 
    }
      
}
