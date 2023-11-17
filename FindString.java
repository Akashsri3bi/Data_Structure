public class FindString {

          public void dfs(StringBuilder curr , StringBuilder ans , Map<String,Integer> map ,  int k){
        StringBuilder temp ; 
        for(int i = k-1;i>=0;i--){
            temp = new StringBuilder(curr.substring(1)) ;
            temp.append((char)(i+'0')) ; 
            if(!map.containsKey(temp.toString())){
                map.put(temp.toString(),1) ; 
                ans.append((char)(i+'0')) ; 
                dfs(temp ,ans,map,k) ; 
                return ; 
            }
        }
    }
    public String findString(int n, int k){
       StringBuilder ans = new StringBuilder() ; 
       StringBuilder temp = new StringBuilder() ;
       Map<String,Integer> map = new HashMap<>() ;
       for(int i =0;i<n;i++){
           ans.append('0') ; 
       }
       temp.append(ans) ; 
       map.put(temp.toString() , 1) ;
       dfs(temp,ans,map,k) ;
       return ans.toString() ; 

    }
      
}
