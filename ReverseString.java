public class ReverseString {
      public static char[] reverseString(char[] s) {
            int i = 0 , j = s.length-1 ; 
            while(i<=j){
                  char temp = s[i] ;
                  s[i] = s[j] ; 
                  s[j] = temp ;  

                  i++ ; 
                  j-- ; 
            }

            return s ; 
      }
      public static void main(String[] args) {
            char[] s = {'h','e','l','l','o'};
            s = reverseString(s) ;
            for(int i = 0 ; i < s.length  ; i++){
                  System.out.print(s[i] + " ");
            }
      }
      
}
