public class check {
      public static boolean isPalindrome(String s) {
            s = s.replaceAll("[^a-zA-Z0-9]", "");
            String y = s.toLowerCase();

            int i = 0, j = y.length() - 1;
            while (i <= j) {
                  if (y.charAt(i) == y.charAt(j)) {
                        i++;
                        j--;
                  }
                  return false ; 
            }

            return true ; 
      }
      public static void main(String[] args) {
            isPalindrome("A man, a plan, a canal: Panama");
      }
      
}
