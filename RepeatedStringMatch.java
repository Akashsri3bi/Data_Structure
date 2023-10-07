public class RepeatedStringMatch {

      private static final int prime = 101;

      static long calculateHash(String a, int m) {
            long hash = 0;
            for (int i = 0; i < m; i++) {
                  hash += (a.charAt(i) * Math.pow(prime, i));
            }
            return hash;
      }

      static long recalculateHash(String a, long oldhash, int oldIndex, int newIndex) {
            long newHash = oldhash - a.charAt(oldIndex);
            newHash = newHash / prime;
            newHash += (a.charAt(newIndex) * Math.pow(prime, newIndex - oldIndex - 1));
            return newHash;
      }

      static boolean checkEqual(String a, int l, String b, int j, int m) {
            for (int i = 0; i < m; i++) {
                  if (a.charAt(i + l) != b.charAt(i + j)) {
                        return false;
                  }
            }
            return true;
      }

      static boolean check(String a, String b) {
            int n = a.length();
            int m = b.length();
            long texthash = calculateHash(a, m);
            long patthash = calculateHash(b, m);
            for (int i = 0; i <= n - m; i++) {
                  if (texthash == patthash && checkEqual(a, i, b, 0, m)) {
                        return true;
                  }
                  if (i < n - m) {
                        texthash = recalculateHash(a, texthash, i, i + m);
                  }
            }
            return false;
      }

      public int repeatedStringMatch(String a, String b) {
            String tp = a;
            int ans = 1;
            while (a.length() < b.length()) {
                  a += tp;
                  ans++;
            }

            if (check(a, b)) {
                  return ans;
            }
            if (check(a + tp, b)) {
                  return ans + 1;
            }
            return -1;
      }
      
}
