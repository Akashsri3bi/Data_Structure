import java.util.Scanner;

public class kickstart8 {

      static boolean isPalindrome(String str) {
            int i = 0, j = str.length() - 1;
            while (i < j) {
                  if (str.charAt(i) != str.charAt(j))
                        return false;

                  i++;
                  j--;
            }

            return true;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            int i = 0;
            while (i < t) {
                  int n = sc.nextInt();
                  String p = sc.next() ;
                  String answer = "";
                  String s = p;
                  for(int k = 0 ; k < p.length() ; k++){
                        s = s + p.charAt(k) ;
                        answer=answer+p.charAt(k) ;
                        if(isPalindrome(s)){
                              break ;
                        } 
                  }
                  System.out.println("Case #" + (i + 1) + ": " + answer);
                  i++;
            }
      }
      
}
