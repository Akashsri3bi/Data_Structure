public class ContainThree {

      static boolean checkAll(int[] map) {
            return map[0] > 0 && map[1] > 0 && map[2] > 0;
      }

      public int numberOfSubstrings(String s) {
            int[] map = new int[3];
            int i = 0;
            int j = 0;
            int count = 0;
            int n = s.length();
            while (j < n) {
                  map[s.charAt(j) - 'a']++;
                  while (checkAll(map)) {
                        count += n - j;
                        map[s.charAt(i) - 'a']--;
                        i++;
                  }
                  j++;
            }
            return count;
      }
      
}
