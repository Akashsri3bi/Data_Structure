public class BetterString {

      static int countSub(String str) {
            HashMap<Character, Integer> map = new HashMap<>();
            int n = str.length();
            int[] dp = new int[n + 1];
            dp[0] = 1;
            for (int i = 1; i <= n; i++) {
                  dp[i] = 2 * dp[i - 1];
                  if (map.containsKey(str.charAt(i - 1))) {
                        dp[i] = dp[i] - dp[map.get(str.charAt(i - 1))];
                  }
                  map.put(str.charAt(i - 1), (i - 1));
            }
            return dp[n];
      }

      public static String betterString(String str1, String str2) {
            // Code here
            int a = countSub(str1);
            int b = countSub(str2);
            if (b > a) {
                  return str2;
            }
            return str1;
      }
      
}
