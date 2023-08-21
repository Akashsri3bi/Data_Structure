public class BitDiff {

      public static int countBitsFlip(int a, int b) {

            // Your code here
            int k = a ^ b;
            int count = 0;
            while (true) {
                  k = k & (k - 1);
                  count++;
                  if (k == 0) {
                        break;
                  }
            }

            return count;
      }
      
}
