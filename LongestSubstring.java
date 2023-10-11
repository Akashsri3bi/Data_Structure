public class LongestSubstring {

      public int longestOnes(int[] nums, int k) {
            int i = 0;
            int j = 0;
            int n = nums.length;
            int cnt = 0;
            int ans = Integer.MIN_VALUE;
            while (j < n) {
                  if (nums[j] == 0) {
                        cnt++;
                  }
                  while (cnt > k) {
                        if (nums[i] == 0) {
                              cnt--;
                        }
                        i++;
                  }
                  ans = Math.max(ans, j - i + 1);
                  j++;
            }
            return ans;
      }
      
}
