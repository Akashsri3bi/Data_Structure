public class LuckyNumber {

      static boolean fun(int n, int i) {
            if (i > n) {
                  return true;
            }
            if (n % i == 0) {
                  return false;
            }

            return fun(n - (n / i), i + 1);
      }

      public static boolean isLucky(int n) {
            // Your code here
            return fun(n, 2);
      }
      
}
