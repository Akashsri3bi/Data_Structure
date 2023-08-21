public class FindFirstBit {

      public static int getFirstSetBit(int n) {

            // Your code here
            int count = 1;
            if (n == 0) {
                  return 0;
            }

            while (n > 0) {
                  if ((n & 1) == 1) {
                        return count;
                  }
                  n = n >> 1;
                  count++;
            }

            return 0;

      }
      
}
