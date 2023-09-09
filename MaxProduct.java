public class MaxProduct {
      public int maxProduct(int[] nums) {
            int maxAns = Integer.MIN_VALUE;
            int pref = 1;
            int suff = 1;
            for (int i = 0; i < nums.length; i++) {
                  if (pref == 0) {
                        pref = 1;
                  }
                  if (suff == 0) {
                        suff = 1;
                  }
                  pref = pref * nums[i];
                  suff = suff * nums[nums.length - i - 1];
                  maxAns = Math.max(maxAns, Math.max(pref, suff));
            }

            return maxAns;
      }
      
}
