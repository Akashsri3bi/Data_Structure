import java.util.HashMap;

public class RomanDecimal {

          public int romanToDecimal(String str) {
        // code here
        HashMap<Character,Integer> map = new HashMap<>() ; 
        
        map.put('I' ,1) ; 
         map.put('V' ,5) ; 
         map.put('X' ,10) ; 
         map.put('L' ,50) ;
         map.put('C' ,100) ; 
         map.put('D' ,500) ; 
        map.put('M' ,1000) ; 
        
        int value = 0 ;
        if(str.length()==0){
            return 0;
        }else if(str.length()==1){
            return map.get(str.charAt(0));
        }else{
        for(int i = 0 ;i<str.length() ;i++){
            if(i<str.length()-1 && (map.get(str.charAt(i)) < map.get(str.charAt(i+1)) )  ){
                value+= map.get(str.charAt(i+1))-map.get(str.charAt(i)) ; 
                i++;
            }else{
                value+=map.get(str.charAt(i)) ; 
            }
        }
        }
        return value ;
    }
      
}
