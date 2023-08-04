import java.util.Arrays;

public class InterleavedString {

      public boolean isInterLeave(String a,String b,String c)
{
   int n=a.length();
   int m=b.length();
   int k=c.length();
   if(k!=n+m)  return false;
   
   int [][]dp=new int[n+1][m+1];
   for(int i=0;i<=n;i++){
       Arrays.fill(dp[i],-1);
   }
   if(solve(a,b,c,0,0,0,dp)==1){
       return true;
   }
   return false;
}
 
int  solve(String a,String b,String c,int i,int j,int k,int [][]dp){
    if(k==c.length()) return dp[i][j]=1;
    
    if(i==a.length()){
        if(b.substring(j).equals(c.substring(k)) )return dp[i][j]=1;
        else return dp[i][j]=0;
    }
    
    if(j==b.length()){
        if(a.substring(i).equals(c.substring(k))) return dp[i][j]=1;
        else return dp[i][j]=0;
    }
    if(dp[i][j]!=-1) return dp[i][j];
    
    int x=0;
    int y=0;
    
    if(a.charAt(i)==c.charAt(k)){
        x=solve(a,b,c,i+1,j,k+1,dp);
    }
    if(b.charAt(j)==c.charAt(k)){
        y=solve(a,b,c,i,j+1,k+1,dp);
    }
    if(x==1 || y==1){
        return dp[i][j]=1;
    }else{
        return dp[i][j]=0;
    }
}
      
}
