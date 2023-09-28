public class SearchInRotated2 {

      public boolean search(int[] nums, int target) {
            int low = 0;
            int high = nums.length - 1;
            while (low <= high) {
                  int mid = low + (high - low) / 2;
                  if (nums[mid] == target)
                        return true;
                  if (nums[low] == nums[mid] && nums[high] == nums[mid]) {
                        low++;
                        high--;
                        continue;
                  }
                  // left half sorted
                  if (nums[low] <= nums[mid]) {
                        if (target >= nums[low] && target <= nums[mid]) {
                              high = mid - 1;
                        } else {
                              low = mid + 1;
                        }
                  } else {
                        if (target >= nums[mid] && target <= nums[high]) {
                              low = mid + 1;
                        } else {
                              high = mid - 1;
                        }
                  }
            }
            return false;
      }
      
}
