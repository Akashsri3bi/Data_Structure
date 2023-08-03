public class BooleanParenthesis {

          
    static long f(int i , int j , boolean isTrue , String s, long[][][] dp){
        int mod = 1003 ;
        if(i>j){
            return 0 ;
        }
        if(dp[i][j][isTrue ? 1 : 0]!=-1){
            return dp[i][j][isTrue ? 1 : 0] ; 
        }
        if(i==j){
            if(isTrue){
                return s.charAt(i)=='T' ? 1 : 0 ;
            }else{
                return s.charAt(i)=='F' ? 1 : 0 ;
            }
        }
        long ways = 0 ; 
        for(int index = i+1 ; index<=j-1 ; index+=2){
            long LT = f(i,index-1,true,s,dp) ;
            long LF = f(i,index-1,false,s,dp) ;
            long RT = f(index+1,j,true,s,dp) ;
            long RF = f(index+1,j,false,s,dp) ;
            
            if(s.charAt(index)=='&'){
                if(isTrue){
                    ways = (ways + (LT*RT)%mod)%mod ;
                    
                }else{
                    ways = (ways + (LT*RF)%mod + (LF*RT)%mod + (LF*RF)%mod)%mod ; 
                }
            }
            if(s.charAt(index)=='|'){
                if(isTrue){
                    ways = (ways + (LT*RT)%mod + (LT*RF)%mod + (RT*LF)%mod )%mod ;
                }else{
                    ways = (ways + (LF*RF)%mod )%mod ; 
                }
            }
            
            if(s.charAt(index)=='^'){
                if(isTrue){
                    ways = (ways + (LT*RF)%mod + (LF*RT)%mod )%mod ;
                    
                }else{
                    ways = (ways + (LT*RT)%mod + (LF*RF)%mod)%mod ; 
                }
            }
        }
        
        dp[i][j][isTrue ? 1 : 0] = ways ;
        return ways ;
    }
    static int countWays(int N, String S){
        // code here
        long[][][] dp = new long[N][N][2] ;
        for(int i = 0 ; i<S.length() ;i++){
            for(int j = 0 ; j<S.length() ;j++){
                for(int k = 0 ; k<2 ; k++){
                    dp[i][j][k] = -1; 
                }
            }
        }
        return (int) f(0,S.length()-1,true,S,dp) ;
    }
      
}
