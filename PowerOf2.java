public class PowerOf2 {

      public static boolean isPowerofTwo(long n) {

            // Your code here
            if (n == 0) {
                  return false;
            } else {
                  return (n & (n - 1)) == 0;
            }
      }
      
}
