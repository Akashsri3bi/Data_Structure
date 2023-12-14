import java.util.Arrays;

public class JumpGame2 {

          static int f(int i , int[] nums , int[] dp){
        if(i>=nums.length-1){
            return 0 ; 
        }
        if(nums[i]==0){
            return Integer.MAX_VALUE;
        }
        if(dp[i]!=-1){
            return dp[i] ; 
        }
        int min = Integer.MAX_VALUE;
        for(int k = 1;k<=nums[i];k++){
            int nextjump = f(i+k,nums,dp) ; 
            if(nextjump!=Integer.MAX_VALUE){
                min = Math.min(1+nextjump,min) ; 
            }
        }
        dp[i] = min;
        return dp[i] ; 
    }
    public int jump(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int[] dp = new int[nums.length]; 
        Arrays.fill(dp,-1) ; 
        return f(0,nums,dp) ; 
    }
      
}
