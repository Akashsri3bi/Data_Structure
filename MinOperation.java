public class MinOperation {

      public int minOperation(int n) {
            // code here.
            int operation = 0;
            while (n > 0) {
                  if (n % 2 == 0) {
                        n /= 2;
                  } else {
                        n -= 1;
                  }
                  operation++;
            }

            return operation;

      }
      
}
