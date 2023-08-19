public class LongestPalindromeSubstring {

      static String longestPalin(String S) {
            // code here
            int n = S.length();
            int start = 0, end = 0, maxl = 1;

            // odd length
            for (int i = 0; i < n; i++) {
                  int l = i, r = i;
                  while (l >= 0 && r < n) {
                        if (S.charAt(l) != S.charAt(r)) {
                              break;
                        }
                        l--;
                        r++;
                  }
                  int len = r - l - 1;
                  if (len > maxl) {
                        maxl = len;
                        start = l + 1;
                        end = r - 1;
                  }
            }

            // even length
            for (int i = 0; i < n; i++) {
                  int l = i, r = i + 1;
                  while (l >= 0 && r < n) {
                        if (S.charAt(l) != S.charAt(r)) {
                              break;
                        }
                        l--;
                        r++;
                  }
                  int len = r - l - 1;
                  if (len > maxl) {
                        maxl = len;
                        start = l + 1;
                        end = r - 1;
                  }
            }

            return S.substring(start, end + 1);
      }
      
}
