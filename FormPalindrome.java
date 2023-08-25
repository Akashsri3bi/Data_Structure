import java.util.Arrays;

public class FormPalindrome {

          static int lcs(String a , String b , int i , int j,int[][] dp){
        if(i>=a.length() || j>=a.length()){
            return 0 ; 
        }
        if(dp[i][j]!=-1){
            return dp[i][j] ; 
        }
        int ans = 0 ;
        if(a.charAt(i)==b.charAt(j)){
            ans = 1 + lcs(a,b,i+1,j+1,dp) ; 
        }else{
            ans = Math.max(lcs(a,b,i,j+1,dp) , lcs(a,b,i+1,j,dp)) ; 
        }
        
        dp[i][j] = ans ;
        return ans ; 
    }
    static int countMin(String str)
    {
        // code here
        
        
        //Find LCS of given string and reverse of this string
        //this will give you longest plaindromic subsequence 
        //Length of string minus this LCS will give you min Characters
        int[][] dp = new int[str.length()][str.length()] ; 
        
        for (int i = 0; i < str.length(); i++) {
        Arrays.fill(dp[i], -1);
    }
    
        StringBuilder rev = new StringBuilder(str) ; 
        int l = lcs(str,rev.reverse().toString(),0,0,dp) ;
        
        
        return str.length() - l  ; 
    }
      
}
