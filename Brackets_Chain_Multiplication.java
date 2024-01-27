public class Brackets_Chain_Multiplication {
      class Pair {
            int first;
            String second;

            Pair(int first, String second) {
                  this.first = first;
                  this.second = second;
            }
      }

      public String matrixChainOrder(int[] p, int n) {
            Pair[][] dp = new Pair[27][27];
            return f(1, n - 1, p, dp).second;
      }

      private Pair f(int i, int j, int[] p, Pair[][] dp) {
            if (i == j) {
                  String curr = "" + (char) ('A' + i - 1);
                  return new Pair(0, curr);
            }

            if (dp[i][j] != null && !dp[i][j].second.isEmpty()) {
                  return dp[i][j];
            }

            int val = Integer.MAX_VALUE;
            String s = "";

            for (int k = i; k < j; k++) {
                  Pair a = f(i, k, p, dp);
                  Pair b = f(k + 1, j, p, dp);
                  int q = p[i - 1] * p[j] * p[k] + a.first + b.first;
                  if (q < val) {
                        val = q;
                        s = "(" + a.second + b.second + ")";
                  }
            }
            dp[i][j] = new Pair(val, s);
            return dp[i][j];
      }

}
