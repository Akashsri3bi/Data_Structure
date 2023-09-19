import java.util.HashMap;

public class PalindromePair {

          static boolean isPalindrome(String s){
        int l = 0 ;
        int r = s.length() - 1 ;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false ;
            }
            l++;
            r--;
        }
        return true ; 
    }
    static boolean palindromepair(int n, String arr[]) {
        // code here
        HashMap<String,Integer> map = new HashMap<>() ; 
        for(int i = 0 ; i < n ;i++){
            map.put(arr[i] , i) ; 
        }
        
        for(int i = 0 ; i < n ;i++){
            String rev = new StringBuilder(arr[i]).reverse().toString() ; 
            Integer ind = map.get(rev) ; 
            if(ind!=null && ind!=i){
                return true ;
            }
        }
        
        for(int i = 0 ; i<n ; ++i){
            String curr = arr[i] ; 
            for(int j = 1 ; j<curr.length() ; j++){
                String left = curr.substring(0,j) ; 
                String right = curr.substring(j) ;
                
                if(isPalindrome(left)){
                    String rev = new StringBuilder(right).reverse().toString() ; 
                    if(map.containsKey(rev)){
                        return true ; 
                    }
                }
                
                if(isPalindrome(right)){
                    String rev = new StringBuilder(left).reverse().toString() ; 
                    if(map.containsKey(rev)){
                        return true ; 
                    }
                }
            }
        }
        return false;
    }
      
}
