public class SmallestWin {

      public int smallestSubstring(String S) {
            int one = 0;
            int zero = 0;
            int two = 0;
            int j = 0;
            int i = 0;
            int res = Integer.MAX_VALUE;

            while (i < S.length()) {
                  if (S.charAt(i) == '0') {
                        zero++;
                  }
                  if (S.charAt(i) == '1') {
                        one++;
                  }
                  if (S.charAt(i) == '2') {
                        two++;
                  }

                  // Check if all three characters are present
                  while (one >= 1 && two >= 1 && zero >= 1) {
                        res = Math.min(res, i - j + 1);

                        // Try to minimize the substring length by moving j
                        if (S.charAt(j) == '0') {
                              zero--;
                        } else if (S.charAt(j) == '1') {
                              one--;
                        } else if (S.charAt(j) == '2') {
                              two--;
                        }
                        j++;
                  }

                  i++;
            }

            return (res == Integer.MAX_VALUE) ? -1 : res;
      }
      
}
