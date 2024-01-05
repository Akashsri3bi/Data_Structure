public class PossibleWays {

      int mod = 1000000007;

      public int TotalWays(int N) {
            long possibilities = 0;
            if (N == 1)
                  possibilities = 2;
            else if (N == 2)
                  possibilities = 3;
            else {
                  long temp1 = 2;
                  long temp2 = 3;
                  long temp = 0;
                  for (int i = 3; i <= N; i++) {
                        temp = (temp1 + temp2) % mod;
                        temp1 = temp2;
                        temp2 = temp;
                  }
                  possibilities = temp;
            }
            return (int) ((possibilities * possibilities) % mod);
      }
      
}
