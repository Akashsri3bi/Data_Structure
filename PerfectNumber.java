public class PerfectNumber {

      static int isPerfectNumber(long N) {
            // code here
            if (N == 1) {
                  return 0;
            }
            long sum = 1;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                  if (N % i == 0) {
                        long s = N / i;
                        sum += s + i;
                  }
            }
            if (sum == N) {
                  return 1;
            }
            return 0;
      }
      
}
