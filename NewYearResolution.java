import java.util.Arrays;

public class NewYearResolution {
              public static boolean isPossible(int n, int[] coins) {
        int[][] dp = new int[n + 1][2025];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }

        if (solve(n, 2024, coins, dp)) return true;

        for (int i = 1; 24 * i <= 2024; i++) {
            if (solve(n, 24 * i, coins, dp)) return true;
        }
        for (int i = 1; 20 * i <= 2024; i++) {
            if (solve(n, 20 * i, coins, dp)) return true;
        }
        return false;
    }

    static  boolean solve(int n, int sum, int[] coins, int[][] dp) {
        if (sum == 0) return true;
        if (sum < 0 || n == 0) return false;
        if (dp[n][sum] != -1) return dp[n][sum] == 1;

        // include
        boolean inc = solve(n - 1, sum - coins[n - 1], coins, dp);

        // exclude
        boolean exc = solve(n - 1, sum, coins, dp);

        dp[n][sum] = inc || exc ? 1 : 0;
        return dp[n][sum] == 1;
    }
      
}
