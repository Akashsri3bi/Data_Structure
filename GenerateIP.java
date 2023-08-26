import java.util.ArrayList;

public class GenerateIP {

          static boolean check(String s){
        int n = s.length() ; 
        if(n<=0 || n>3){
            return false ; 
        }
        if(s.charAt(0)=='0' && n>1){
            return false ; 
        }
        
        
        int p = Integer.parseInt(s) ; 
        if(p<0 || p>255){
            return false ; 
        }
        return true ; 
        
    }
    static String generate(String s, int n , int i , int j , int k){
        String s1 = s.substring(0,i+1) ; 
        String s2 = s.substring(i+1,j) ; 
        String s3 = s.substring(j,k) ; 
        String s4 = s.substring(k,n) ; 
        
        if(check(s1) && check(s2) && check(s3)&& check(s4)){
            return s1 + "." + s2 + "." + s3+"."+s4;
        }
        
        return "" ; 
    }
    public ArrayList<String> genIp(String s) {
        // code here
        ArrayList<String> ans = new ArrayList<>() ; 
        
        int n = s.length()  ;
        
        for(int i = 0 ; i<n; i++){
            for(int j = i+1;j<n ;j++){
                for(int k = j+1;k<n;k++){
                    String st = generate(s,n,i,j,k) ; 
                    if(st.length()>0){
                        ans.add(st) ; 
                    }
                }
            }
        }
        
        return ans ;
    }
      
}
