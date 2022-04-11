public class PalindromeString {
      //String palindrome check in java
      static int isPalindrome(String S) {
            
            String X = "" ;
            for(char i : S.toCharArray()){
                  X = i + X; 
            }

            if(X.equals(S)){
                  return 1 ;
            }else{
            return 0 
            ;
            }
      }

      public static void main(String[] args) {
            System.out.println(isPalindrome("aba"));
      }
      
}
