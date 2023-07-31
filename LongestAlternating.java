public class LongestAlternating {

      public int AlternatingaMaxLength(int[] nums) {
            // code here
            // We will use relationship between increasing and decreasing subsequence
            int incr = 1;
            int decr = 1;
            // 1 value tells us that counting first element
            int curr = nums[0];
            for (int i = 1; i < nums.length; i++) {
                  if (curr < nums[i]) {
                        incr = 1 + decr;
                        curr = nums[i];
                  } else if (curr > nums[i]) {
                        decr = 1 + incr;
                        curr = nums[i];
                  }
            }

            return Math.max(incr, decr);
      }
      
}
