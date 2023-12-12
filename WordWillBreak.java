import java.util.Arrays;
import java.util.List;

public class WordWillBreak {

          static boolean isPresent(int i , int j , String s,List<String> wordDict){
        return wordDict.contains(s.substring(i,j+1)) ; 
    }
    static boolean f(int i , int j , String s, List<String> wordDict , int[][] dp){
        if(i>j){
            return true ; 
        }
        if(dp[i][j]!=-1){
            return dp[i][j]==1?true:false ;
        }
        boolean works = false ; 
        for(int ind = i ; ind<=j ; ind++){
            if(isPresent(i,ind,s,wordDict)){
                works = f(ind+1,j,s,wordDict,dp) ; 
                if(works){
                    break ;
                }
            }
        }
        dp[i][j] = works?1:0 ;
        return dp[i][j]==1?true:false ; 
    }
    public boolean wordBreak(String s, List<String> wordDict){
        int[][] dp = new int[s.length()][s.length()] ; 
        for(int i =  0 ;i<s.length();i++){
            Arrays.fill(dp[i],-1) ; 
        }
        return f(0,s.length()-1,s,wordDict,dp) ;
    }
      
}
