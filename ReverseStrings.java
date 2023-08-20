import java.util.LinkedList;
import java.util.Queue;

public class ReverseStrings {

          String reverseWords(String S)
    {
        // code here 
        String result = "" ; 
        Queue<String> q = new LinkedList<>() ; 
        String ans= "" ; 
        for(int i = S.length()-1 ; i>=0;i--){
          
            if(S.charAt(i)=='.'){
                q.add(ans) ;
                ans="" ;
            }else{
                ans = S.charAt(i) + ans; 
            }
            
        }
        q.add(ans) ; 
        
        while(!q.isEmpty()){
            
            if(q.size()==1){
            String temp = q.poll() ; 
            result =result + temp ;
            }else{
            String temp = q.poll() ; 
            result =result + temp + "." ;
            }
            
            
        }
        
        return result; 
        
    }
      
}
