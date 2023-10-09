public class ShortestPath {

      static void func(int[] lps, String a) {
            int i = 0;
            int j = 1;
            while (j < a.length()) {
                  if (a.charAt(i) == a.charAt(j)) {
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
      }

      public String shortestPalindrome(String s) {
            StringBuilder sb = new StringBuilder(s);
            String t = sb.reverse().toString();
            String a = s + "#" + t;
            int[] lps = new int[a.length()];
            func(lps, a);

            int i = lps[lps.length - 1];
            String temp = s.substring(i);
            StringBuilder k = new StringBuilder(temp);
            return k.reverse().toString() + s;

      }
      
}
