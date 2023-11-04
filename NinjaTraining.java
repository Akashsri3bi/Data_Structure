public class NinjaTraining {

      static int f(int n, int task, int[][] points, int[][] dp) {
            if (n == 0) {
                  int maxi = 0;
                  for (int i = 0; i < 3; i++) {
                        if (task != i) {
                              maxi = Math.max(maxi, points[0][i]);
                        }
                  }
                  return maxi;
            }
            if (dp[n][task] != -1) {
                  return dp[n][task];
            }
            int maxi = 0;
            for (int i = 0; i < 3; i++) {
                  if (task != i) {
                        int point = points[n][i] + f(n - 1, i, points, dp);
                        maxi = Math.max(maxi, point);
                  }
            }
            dp[n][task] = maxi;
            return dp[n][task];
      }

      public static int ninjaTraining(int n, int points[][]) {
            // Write your code here..
            int[][] dp = new int[n][4];
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < 4; j++) {
                        dp[i][j] = -1;
                  }
            }
            return f(n - 1, 3, points, dp);
      }
      
}
