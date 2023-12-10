public class PalindromePartition {

          static boolean isPalindrome(int i , int j , String s ){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true ;
    }
    static int f(int i , String s , int[] dp){
        if(i==s.length()){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i] ; 
        }
        int mini = Integer.MAX_VALUE ; 
        for(int j = i;j<s.length();j++){
            if(isPalindrome(i,j,s)){
                int cost = 1 + f(j+1,s,dp) ; 
                mini = Math.min(mini ,cost) ; 
            }
        }
        dp[i] = mini ; 
        return dp[i] ; 
    }
    public int minCut(String s) {
        int[] dp = new int[s.length()+1] ; 
        Arrays.fill(dp,-1) ; 
        return f(0,s,dp)-1 ; 
    }
      
}
