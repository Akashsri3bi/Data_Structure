public class CountSub {

      static int f(int[] nums, int k) {
            int i = 0;
            int j = 0;
            int n = nums.length;
            int res = 0;
            int count = 0;
            if (k < 0) {
                  return 0;
            }
            while (j < n) {
                  if (nums[j] % 2 != 0) {
                        count++;
                  }
                  while (count > k) {
                        if (nums[i] % 2 != 0) {
                              count--;
                        }
                        i++;
                  }
                  res += (j - i + 1);
                  j++;
            }
            return res;
      }

      public int numberOfSubarrays(int[] nums, int k) {
            return f(nums, k) - f(nums, k - 1);
      }
      
}
