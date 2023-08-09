public class LongestCommonPrefix {

      String longestCommonPrefix(String arr[], int n) {
            // code here
            int minLength = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                  minLength = Math.min(minLength, arr[i].length());
            }

            String ans = "";

            for (int i = 0; i < minLength; i++) {
                  char start = arr[0].charAt(i);
                  for (int j = 1; j < n; j++) {
                        char curr = arr[j].charAt(i);
                        if (curr != start && i == 0) {
                              return "-1";
                        } else if (curr != start) {
                              return ans;
                        }
                  }
                  ans = ans + start;
            }

            return ans;

      }
      
}
