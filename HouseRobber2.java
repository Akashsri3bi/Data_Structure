public class HouseRobber2 {

          static int f(int[] dp , int n , int[] nums){
        if(n<=0){
            return 0 ;
        }
        if(dp[n]!=-1){
            return dp[n] ; 
        }
        int nottake = f(dp,n-1,nums) ; 
        int take = 0 ;
        take = nums[n-1] + f(dp,n-2,nums) ;
    
        dp[n] = Math.max(take , nottake) ; 
        return dp[n] ; 
        
    }
    public int rob(int[] nums) {
        int n = nums.length ; 
        if(n==1) return nums[0] ;
        int[] temp1 = new int[n-1] ; 
        int k = 0 ;
        for(int i = 0 ;i<n-1;i++){
            temp1[k] = nums[i] ;
            k++; 
        }
        k = 0 ;
        int[] temp2 = new int[n-1] ; 
        for(int i = 1 ;i<n;i++){
            temp2[k] = nums[i] ;
            k++; 
        }
        int[] dp = new int[n] ; 
        int[] dp2 = new int[n] ; 
        for(int i = 0 ;i<n;i++){
            dp[i] = -1 ; 
            dp2[i] = -1;
        }
        return Math.max(f(dp,n-1,temp1) , f(dp2,n-1,temp2));
    }
      
}
