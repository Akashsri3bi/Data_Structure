public class FirstBit {

      public static int getFirstSetBit(int n) {

            // Your code here
            int c = 1;
            while (n > 0) {
                  if ((n & 1) != 0) {
                        return c;
                  }
                  c++;
                  n = n >> 1;
            }

            return 0;
      }
      
}
