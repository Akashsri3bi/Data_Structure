public class RightMost {

      public static int posOfRightMostDiffBit(int m, int n) {

            // Your code here
            int k = 1;
            while (n > 0 || m > 0) {
                  if ((n & (1)) != (m & (1))) {
                        return k;
                  }
                  n = n >> 1;
                  m = m >> 1;
                  k++;
            }

            return -1;
      }
      
}
