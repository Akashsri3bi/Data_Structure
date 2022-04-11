public class RemoveConsecutiveCharacter {

      public static String removeConsecutiveCharacter(String S) {
            String s = "" ;
            char[] P = S.toCharArray() ;
            s = s + P[0] ;  
            for(int i = 1 ; i < P.length ; i++){
                  if(P[i]!=P[i-1]){
                        s = s + P[i];                        
                  }
            }

            return s ; 
      }

      public static void main(String[] args) {
            System.out.print(removeConsecutiveCharacter("aaba"));
      }
      
}
