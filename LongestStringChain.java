import java.util.Arrays;

public class LongestStringChain {
          static boolean ifPossible(String a , String b){
        if(a.length()!=b.length()+1) return false ; 
        int first = 0 ; 
        int second = 0 ;
        while(first<a.length()){
            if(second==b.length()){
                first++;
                continue;
            }
            if(a.charAt(first)==b.charAt(second)){
                first++;
                second++ ;
            }else{
                first++;
            }
        }
        if(first==a.length() && second==b.length()){
            return true; 
        }
        return false ; 

    }
    public int longestStrChain(String[] words) {
        int n = words.length ; 
        int[] dp = new int[n+1] ;
         Arrays.sort(words,(a,b)->Integer.compare(a.length(), b.length()));
        Arrays.fill(dp,1) ; 
        int ans = 1 ;
        for(int i = 0;i<n;i++){
            for(int prev = 0;prev<i;prev++){
                if(ifPossible(words[i],words[prev]) && 1+ dp[prev]>dp[i]){
                    dp[i] = 1 + dp[prev] ; 
                }
            }
            if(dp[i]>ans){
                ans = dp[i] ; 
            }
        }
        return ans ;  
    }
      
}
