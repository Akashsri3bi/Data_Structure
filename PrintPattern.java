import java.util.ArrayList;
import java.util.List;

public class PrintPattern {
          public List<Integer> pattern(int N){
        // code here
        List<Integer> ans = new ArrayList<>() ; 
        ans.add(N) ; 
        if(N<=0){
            return ans ; 
        }
        int t = N-5 ; 
        boolean flag = false ; 
        while(t<=N){
            ans.add(t) ; 
            if(t<=0){
                flag = true ; 
            }
            if(flag){
                t+=5 ; 
            }else{
                t-=5 ; 
            }
        }
        return ans ; 
    }
      
}
