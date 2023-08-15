public class Anagram {

          public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        if(a.length()!=b.length()){
            return false ; 
        }else{
            
            HashMap<Character,Integer> map = new HashMap<>() ;
            
            for(int i = 0 ; i<a.length() ; i++){
                if(map.containsKey(a.charAt(i))){
                    map.put(a.charAt(i) , map.get(a.charAt(i))+1);
                }else{
                    map.put(a.charAt(i),1);
                }
            }
            
            for(int i = 0 ;i<b.length() ; i++){
                if(map.containsKey(b.charAt(i))){
                    map.put(b.charAt(i),map.get(b.charAt(i))-1) ;
                    int x = map.get(b.charAt(i));
                    if(x==0){
                        map.remove(b.charAt(i)) ;
                    }
                }
            }
            
            if(map.size()==0){
                return true ;
            }else{
                return false;
            }
        }
    }
      
}
