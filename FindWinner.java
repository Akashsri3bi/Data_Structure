import java.util.Arrays;

public class FindWinner {
          public int findWinner(int N,int X,int Y)
    {
        // Code here
        // To store results
        boolean[] dp = new boolean[N + 1];
      
        Arrays.fill(dp, false);
     
        // Initial values
        dp[0] = false;
        dp[1] = true;
      
        // Computing other values.
        for (int i = 2; i <= N; i++) {
      
            // If A losses any of i-1 or i-x
            // or i-y game then he will
            // definitely win game i
            if (i - 1 >= 0 && dp[i - 1] == false)
                dp[i] = true;
            else if (i - X >= 0 && dp[i - X] == false)
                dp[i] = true;
            else if (i - Y >= 0 && dp[i - Y] == false)
                dp[i] = true;
      
            // Else A loses game.
            else
                dp[i] = false;
        }
      
        // If dp[n] is true then A will
        // game otherwise  he losses
        return dp[N]? 1 : 0;
    }
      
}
