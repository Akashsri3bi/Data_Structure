import java.util.HashMap;

public class ArraySubset {

          public String isSubset( long a1[], long a2[], long n, long m) {
        HashMap<Long,Integer> map = new HashMap<>() ; 
        
        for(int i = 0;i<n;i++){
            if(map.containsKey(a1[i])){
                map.put(a1[i] , map.get(a1[i])+1) ;
            }else{
                map.put(a1[i] , 1) ; 
            }
        }
        
        for(int i = 0 ;i<m;i++){
            if(map.containsKey(a2[i])){
                int count = map.get(a2[i]) ; 
                if(count<=0){
                    return "No" ;
                }else{
                map.put(a2[i] , map.get(a2[i])-1) ;
                }
            }else{
               return "No";
            }
        }
        return "Yes" ;
        
    }
      
}
