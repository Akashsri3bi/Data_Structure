public class LongestHappyPrefix {

      public String longestPrefix(String s) {
            // We will use simple kmp algorithms lps array build
            // Longest Prefix Suffix Array is to be built here
            int n = s.length();
            int i = 0;
            int j = 1;
            if (n == 0) {
                  return "";
            }
            int[] lps = new int[n];
            while (j < n) {
                  if (s.charAt(i) == s.charAt(j)) {
                        i++;
                        lps[j] = i;
                        j++;
                  } else {
                        if (i == 0) {
                              j++;
                        } else {
                              i = lps[i - 1];
                        }
                  }
            }
            return s.substring(0, i);
      }
      
}
