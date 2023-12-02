import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintingLIS {

public static List<Integer> printingLongestIncreasingSubsequence(int[] arr, int x) {
    int[] dp = new int[x];
    int[] hash = new int[x];

    // Initialize dp array with all elements set to 1
    Arrays.fill(dp, 1);

    // Initialize hash array with all elements set to -1
    Arrays.fill(hash, -1);

    int maxi = 1;
    int lastind = 0;

    for (int i = 0; i < x; i++) {
        for (int prev = 0; prev < i; prev++) {
            if (arr[prev] < arr[i] && 1 + dp[prev] > dp[i]) {
                dp[i] = 1 + dp[prev];
                hash[i] = prev;
            }
        }
        if (dp[i] > maxi) {
            maxi = dp[i];
            lastind = i;
        }
    }

    ArrayList<Integer> list = new ArrayList<>(maxi);
    list.add(arr[lastind]);
    while (hash[lastind] != -1) {
        lastind = hash[lastind];
        list.add(arr[lastind]);
    }
    Collections.reverse(list);

    return list;
}
      
}
