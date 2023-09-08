public class LongestPalindromicSubstring {

      static boolean isPalindrome(String S, int i, int j) {
            while (i < j) {
                  if (S.charAt(i) != S.charAt(j)) {
                        return false;
                  }
                  i++;
                  j--;
            }
            return true;
      }

      String longestPalindrome(String S) {
            // code here
            String res = "";
            for (int i = 0; i < S.length(); i++) {
                  for (int j = i; j < S.length(); j++) {
                        if (isPalindrome(S, i, j)) {
                              String check = S.substring(i, j + 1);
                              if (check.length() > res.length()) {
                                    res = check;
                              }
                        }
                  }
            }

            return res;
      }
      
}
