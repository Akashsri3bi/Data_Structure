public class BleakNumber {
      public int is_bleak(int n) {
            // Code here
            for (int i = n - 30; i <= n; i++) {
                  if (i + csb(i) == n) {
                        return 0;
                  }
            }
            return 1;
      }

      static int csb(int n) {
            int count = 0;
            while (n > 0) {
                  count += (n & 1);
                  n = n >> 1;
            }
            return count;
      }
}
