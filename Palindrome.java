import javax.swing.text.StyledEditorKit.BoldAction;

public class Palindrome {

      public static boolean isPalindrome(int x) {
            int sum = 0;
            int temp = x;
            while (temp > 0) {
                  int rem = temp % 10;
                  sum = sum * 10 + rem;
                  temp = temp / 10;
            }
            if (x == sum) {
                  return true;
            } else {
                  return false;
            }
      }
      public static void main(String[] args) {
            boolean x = isPalindrome(121);
            boolean y = isPalindrome(123) ; 
            System.out.println(x);
            System.out.println(y);
      }
      
}
