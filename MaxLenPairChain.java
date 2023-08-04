public class MaxLenPairChain {

      int n = pairs.length;

      // Step 1: Sort the pairs array based on the ending value of each pair
      Arrays.sort(pairs,(a,b)->a[1]-b[1]);

      // Step 2: Initialize dp array to store the longest chain ending at each index
      int[] dp = new int[n];Arrays.fill(dp,1); 
      for(int i = 1;i<n;i++)
      {
            for (int j = 0; j < i; j++) {
                  // Step 4: Update dp[i] if pairs[j] can be chained with pairs[i]
                  if (pairs[j][1] < pairs[i][0]) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                  }
            }
      }

      // Step 5: Find the maximum value in the dp array
      int maxLength = 0;for(
      int length:dp)
      {
            maxLength = Math.max(maxLength, length);
      }

      return maxLength;
      
}
