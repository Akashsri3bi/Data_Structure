    import java.util.*;
    public class SubArrayXor{
    public int solve(ArrayList<Integer> A, int B) {
        int xor = 0;
        int count = 0 ;
        HashMap<Integer , Integer> map = new HashMap<>() ;
        map.put(0,1) ; 
        for(int i = 0 ;i<A.size() ; i++){
            xor = xor^A.get(i) ; 
            int prefixToBeFound = xor^B ;
            if(map.containsKey(prefixToBeFound)){
                count+=map.get(prefixToBeFound) ; 
                
            }
            if(map.containsKey(xor)){
                map.put(xor,map.get(xor)+1) ; 
            }else{
                map.put(xor,1) ;
            }
        }
        
        return count ; 
    }
}