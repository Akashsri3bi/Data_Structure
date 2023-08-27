public class RabinKarp {

          ArrayList<Integer> search(String pat, String s)
    {
        // your code here
        ArrayList<Integer> ans = new ArrayList<>() ; 
        
        int d = 256 ; 
        int q = 101 ; 
        
        int m = pat.length() ; 
        int n = s.length() ; 
        int i,j ; 
        int p = 0 ;
        int t = 0 ; 
        int h = 1 ;
        
        
        //This thing is used to calculate highest power now this highest power
        //number can be too big at a point so we also need modulus
        
        for(int l = 0 ;l<m-1;l++){
            h = (h*d)%q  ; 
        }
        
        //Calculating hash value for pattern and first window
        //of text ;
        for(int k = 0 ;k<m;k++){
            p = (d*p + pat.charAt(k))%q ; 
            t = (d*t + s.charAt(k))%q ;
        }
        
        //Slide the pattern over text one by one 
        for(i = 0;i<=n-m;i++){
            if(p==t){
                for(j = 0 ;j<m;j++){
                    if(s.charAt(i+j)!=pat.charAt(j)){
                        break ; 
                    }
                }
                if(j==m){
                    ans.add(i+1) ; 
                }
            }
            
            //Calculate hash for next window 
            if(i<n-m){
                t = (d*(t - s.charAt(i)*h  ) + s.charAt(i+m))%q ; 
                if(t<0){
                    t = (t + q) ; 
                }
            }
        }
        
        if(ans.size()==0){
            ans.add(-1) ; 
        } 
        
        return ans ; 
        
        
    }
      
}
