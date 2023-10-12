public class LongestReplacementCharacter {

         public int characterReplacement(String s, int k) {
       Map<Character,Integer> map = new HashMap<>() ; 
       int l = 0 ;
       int r = 0 ;
       int res = 0 ;
       int maxF = Integer.MIN_VALUE ; 
       int n = s.length() ;
       while(r<n){
           if(map.containsKey(s.charAt(r))){
               map.put(s.charAt(r) , map.get(s.charAt(r))+1) ; 
           }else{
               map.put(s.charAt(r) , 1) ; 
           }
           maxF = Math.max(maxF , map.get(s.charAt(r))) ; 
            
           while((r-l+1) - maxF > k){
               map.put(s.charAt(l) , map.get(s.charAt(l))-1) ; 
               for(int m : map.values()){
                   maxF = Math.max(maxF , m) ; 
               }
               l++;
           }
           res = Math.max(res , r-l+1) ; 
           r++;
       }
       return res ; 
    }
      
}
