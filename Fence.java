class Fence{
          long countWays(int n,int k)
    {
        int MOD = 1000000007 ;
        if (n == 0) return 0;
        if (n == 1) return k;

        // Initialize dp array to store the number of ways for each position
        long[] dp = new long[n + 1];
        dp[1] = k;
        dp[2] = k * k;

        for (int i = 3; i <= n; i++) {
            // For each position, there are two possibilities:
            // 1. It has the same color as the previous post, then it depends on the previous post's two colors options.
            // 2. It has a different color than the previous post, then it depends on the previous post's one color option.
            dp[i] = ( (dp[i - 1]*(k-1))%MOD + (dp[i - 2]*(k-1))%MOD )%MOD ; 
        }

        return (int) dp[n];
        
    }
}