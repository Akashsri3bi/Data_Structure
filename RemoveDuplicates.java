public class RemoveDuplicates {

      String removeDups(String S) {
            // code here
            boolean[] dup = new boolean[26];
            String ans = "";
            for (int i = 0; i < S.length(); i++) {
                  char c = S.charAt(i);
                  if (!dup[c - 'a']) {
                        ans = ans + S.charAt(i);
                        dup[c - 'a'] = true;
                  }

            }

            return ans;
      }
      
}
