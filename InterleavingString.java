import java.util.Arrays;

public class InterleavingString {

          static boolean solve(int i , int j , String s1 , String s2 , String s3 , int[][] dp){
        if(i==s1.length() && j==s2.length()){
            return true ; 
        }
        if(dp[i][j]!=-1){
            return dp[i][j]==1?true:false;
        }
        boolean result = false ; 
        if(i<s1.length() && s1.charAt(i)==s3.charAt(i+j)){
            result = solve(i+1,j,s1,s2,s3,dp) ; 
            if(result){
                return true;
            }
        }
        if(j<s2.length() && s2.charAt(j)==s3.charAt(i+j)){
            result = solve(i,j+1,s1,s2,s3,dp) ; 
            
        }
        dp[i][j] = result?1:0 ;
        return dp[i][j]==1?true:false; 

    }
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s3.length()!= s1.length()+s2.length()){
            return false;
        }
        int[][] dp = new int[s1.length()+1][s2.length()+1] ; 
        for(int i = 0;i<=s1.length();i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0,0,s1,s2,s3,dp) ; 
    }
      
}
