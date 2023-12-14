public class RotateArray {

      public void rotate(int[] nums, int k) {
            int n = nums.length;
            k = k % nums.length; // since they can give a bigger rotation
            reverse(nums, 0, n - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, n - 1);
      }

      static void reverse(int[] nums, int i, int j) {
            while (i < j) {
                  int temp = nums[i];
                  nums[i] = nums[j];
                  nums[j] = temp;
                  i++;
                  j--;
            }
      }
      
}
