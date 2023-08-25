public class Lps {

      int lps(String s) {
            // code here
            int[] lps = new int[s.length()];
            lps[0] = 0;
            int i = 1;
            int j = 0;
            while (i < s.length()) {
                  if (s.charAt(i) == s.charAt(j)) {
                        j = j + 1;
                        lps[i] = j;
                        i++;
                  } else {
                        if (j != 0) {
                              j = lps[j - 1];

                        } else {
                              lps[i] = 0;
                              i++;
                        }
                  }
            }

            return lps[s.length() - 1];
      }
      
}
