public class BinarySub {

      static int atmostSumG(int[] nums, int goal) {
            int i = 0;
            int j = 0;
            int res = 0;
            int sum = 0;
            if (goal < 0) {
                  return 0;
            }
            while (j < nums.length) {
                  sum += nums[j];
                  while (sum > goal) {
                        sum -= nums[i];
                        i++;
                  }
                  res += (j - i + 1); // window length
                  j++;
            }
            return res;
      }

      public int numSubarraysWithSum(int[] nums, int goal) {
            return atmostSumG(nums, goal) - atmostSumG(nums, goal - 1);
      }
      
}
