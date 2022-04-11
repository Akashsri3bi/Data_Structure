class HelloWorld {
      static int lps(String x, String y) {
            int i = 0;
            int len = 0;
            while (i < Math.min(x.length(), y.length())) {
                  if (x.charAt(i) == y.charAt(i)) {
                        len++;
                        i++;
                  } else {
                        break;
                  }
            }
            return len;
      }

      public static String longestCommonPrefix(String[] strs) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < strs.length - 1; i++) {
                  int news = lps(strs[i], strs[i + 1]);
                  min = Math.min(news, min);
            }

            return strs[0].substring(0, min);
      }

      public static void main(String[] args) {
            String[] strs = { "flower", "flow", "flight" };
            System.out.println(longestCommonPrefix(strs));
      }
}