public class LargestSumSquare {

      static int solve(int i, int j, int n, int m, int[][] mat, int[][] dp) {
            if (i >= n || j >= m) {
                  return 0;
            }

            if (dp[i][j] != -1) {
                  return dp[i][j];
            }

            int right = solve(i, j + 1, n, m, mat, dp);
            int diagonal = solve(i + 1, j + 1, n, m, mat, dp);
            int down = solve(i + 1, j, n, m, mat, dp);

            if (mat[i][j] == 1) {
                  int k = Math.min(diagonal, down);
                  int ans = 1 + Math.min(right, k);
                  dp[i][j] = ans;
                  return ans;
            } else {
                  dp[i][j] = 0;
                  return 0;
            }
      }

      static int maxSquare(int n, int m, int mat[][]) {
            // code here
            int[][] dp = new int[n][m];
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < m; j++) {
                        dp[i][j] = -1;
                  }
            }
            int maxi = 0;
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < m; j++) {
                        maxi = Math.max(maxi, solve(i, j, n, m, mat, dp));
                  }
            }
            return maxi;

      }
      
}
