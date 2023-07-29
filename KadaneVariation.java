public class KadaneVariation {

      int maxSubstring(String S) {
            // code here
            int ans = Integer.MIN_VALUE;
            int sum = 0;

            for (int i = 0; i < S.length(); i++) {
                  if (S.charAt(i) == '1') {
                        sum--;
                  } else {
                        sum++;
                  }

                  ans = Math.max(ans, sum);
                  if (sum < 0) {
                        sum = 0;
                  }
            }

            return ans;
      }
      
}
