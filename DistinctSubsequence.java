public class DistinctSubsequence {

      int distinctSubsequences(String S) {
            // code here
            HashMap<Character, Integer> map = new HashMap<>();
            int[] dp = new int[S.length() + 1];
            dp[0] = 1;
            int mod = 1000000007;
            for (int i = 1; i < dp.length; i++) {
                  char c = S.charAt(i - 1);
                  dp[i] = (dp[i - 1] * 2) % mod;
                  if (map.containsKey(c)) {
                        int ind = map.get(c);
                        dp[i] = (dp[i] - dp[ind - 1]) % mod;
                  }
                  map.put(c, i);
            }
            if (dp[S.length()] <= 0) {
                  dp[S.length()] += mod;
            }
            return dp[S.length()];
      }
      
}
