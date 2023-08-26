public class RearrangeCharacter {

      static char getMaxFreqChar(int[] count) {
            char maxChar = 'a';
            int maxCount = -1;
            for (int i = 0; i < 26; i++) {
                  if (maxCount < count[i]) {
                        maxCount = count[i];
                        maxChar = (char) (97 + i);
                  }
            }

            return maxChar;
      }

      public static String rearrangeCharacters(String str) {
            // code here
            int[] count = new int[26];
            for (int i = 0; i < str.length(); i++) {
                  count[str.charAt(i) - 'a']++;
            }

            int n = str.length();

            int i = 0;
            char[] arr = new char[n];
            char c = getMaxFreqChar(count);
            int maxCount = count[c - 'a'];

            if (maxCount > (n + 1) / 2) {
                  return "-1";
            }

            while (maxCount > 0) {
                  arr[i] = c;
                  i += 2;
                  maxCount--;
            }

            count[c - 'a'] = 0;
            for (int k = 0; k < 26; k++) {
                  while (count[k] > 0) {
                        if (i >= n) {
                              i = 1;
                        }
                        arr[i] = (char) (97 + k);
                        i += 2;
                        count[k]--;
                  }
            }

            String res = "";
            for (char m : arr) {
                  res = res + m;
            }
            return res;

      }
      
}
