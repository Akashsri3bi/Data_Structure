import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationString {

          static String swap(String s, int index , int j){
        char[] arr = s.toCharArray() ; 
        char temp = arr[index] ; 
        arr[index] = arr[j] ; 
        arr[j] = temp ; 
        return String.valueOf(arr) ; 
    }
    static void solve(String S , List<String> ans, int index){
        if(index>=S.length()){
            if(!ans.contains(S)){
                ans.add(S) ; 
            } 
            return ;
        }
        for(int j = index ;j < S.length() ;j++){
            S = swap(S,index,j) ; 
            solve(S,ans,index+1);
            S = swap(S,index,j);
        }
    }
    public List<String> find_permutation(String S) {
        // Code here
        List<String> ans = new ArrayList<>(); 
        solve(S, ans , 0);
        Collections.sort(ans) ;
        return ans ; 
    }
      
}
