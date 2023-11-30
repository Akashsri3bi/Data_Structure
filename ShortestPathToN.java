public class ShortestPathToN {

      public int minStep(int n) {
            // code here
            if (n == 1) {
                  return 0;
            }
            if (n % 3 == 0) {
                  return 1 + minStep(n / 3);
            }
            return 1 + minStep(n - 1);
      }
      
}
