public class NonRepeting {

      public int[] singleNumber(int[] nums) {
            // Code here
            int ele1 = 0;
            int ele2 = 0;
            int all = 0;
            for (int i = 0; i < nums.length; i++) {
                  all = nums[i] ^ all;
            }

            int msb = 31;
            for (int i = msb; i >= 0; i--) {
                  int ithbit = (all >> i) & 1;
                  if (ithbit == 1) {
                        msb = i;
                        break;
                  }
            }

            for (int i = 0; i < nums.length; i++) {
                  int setbit = (nums[i] >> msb) & 1;
                  if (setbit == 1) {
                        ele1 = ele1 ^ nums[i];
                  } else {
                        ele2 = ele2 ^ nums[i];
                  }
            }

            int[] ans = new int[2];
            ans[0] = ele2;
            ans[1] = ele1;
            return ans;

      }
      
}
