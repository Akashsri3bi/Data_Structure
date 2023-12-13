public class Consecutive1 {
      static int mod = 1000000007;

      long countStrings(int n) {
            // code here
            long prev_zero = 1;
            long prev_one = 1;
            long curr_zero = 1;
            long curr_one = 1;
            for (int i = 2; i <= n; i++) {
                  curr_zero = (prev_zero + prev_one) % mod;
                  curr_one = (prev_zero) % mod;
                  prev_zero = curr_zero;
                  prev_one = curr_one;
            }
            return (curr_zero + curr_one) % mod;
      }
}
