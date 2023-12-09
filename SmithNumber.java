public class SmithNumber {

      static int sumOfDigits(int n) {
            int sum = 0;
            while (n > 0) {
                  sum += n % 10;
                  n = n / 10;
            }
            return sum;
      }

      static boolean isPrime(int n) {
            if (n == 1) {
                  return false;
            }
            for (int i = 2; i <= n / 2; i++) {
                  if (n % i == 0) {
                        return false;
                  }
            }
            return true;
      }

      static int sumOfPrimeFactors(int n) {
            int f = 1;
            int sum = 0;
            while (n > 1) {
                  ++f;
                  if (!isPrime(f)) {
                        continue;
                  }
                  while (n % f == 0) {
                        sum += sumOfDigits(f);
                        n /= f;
                  }

            }
            return sum;
      }

      static int smithNum(int n) {
            // code here
            if (isPrime(n)) {
                  return 0;
            }
            if (sumOfDigits(n) == sumOfPrimeFactors(n)) {
                  return 1;
            }
            return 0;
      }
      
}
