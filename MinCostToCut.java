import java.util.Arrays;

public class MinCostToCut {

      static int f(int i , int j , int[] cuts , int[][] dp){
        if(i>j){
            return 0 ; 
        }
        if(dp[i][j]!=-1){
          return dp[i][j] ; 
        }
        int mini = Integer.MAX_VALUE ; 
        for(int ind = i ;ind<=j; ind++){
            int cost = cuts[j+1] - cuts[i-1] + f(i,ind-1,cuts,dp) + f(ind+1,j,cuts,dp) ;
            mini = Math.min(mini,cost) ;  
        }
        dp[i][j] =  mini ;
        return dp[i][j] ;  
    }
    public int minCost(int n, int[] cuts) {
    Arrays.sort(cuts);
    int[] temp = new int[cuts.length + 2];
    temp[0] = 0;
    System.arraycopy(cuts, 0, temp, 1, cuts.length);
    temp[temp.length - 1] = n;

    int[][] dp = new int[temp.length][temp.length];
    for (int i = 0; i < temp.length; i++) {
        Arrays.fill(dp[i], -1);
    }

    return f(1, temp.length - 2, temp, dp);
 
    }
      
}
