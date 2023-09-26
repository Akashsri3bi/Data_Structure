import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
      public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            int n = nums.length;
            Arrays.sort(nums);
            for (int i = 0; i < n - 2; i++) {
                  if (i > 0 && nums[i] == nums[i - 1]) {
                        continue;
                  }
                  int j = i + 1;
                  int k = n - 1;
                  while (j < k) {
                        int sum = nums[i] + nums[j] + nums[k];
                        if (sum == 0) {
                              ArrayList<Integer> list = new ArrayList<>();
                              list.add(nums[i]);
                              list.add(nums[j]);
                              list.add(nums[k]);
                              ans.add(list);
                              while (j < k && nums[j] == nums[j + 1]) {
                                    j++;
                              }
                              while (j < k && nums[k] == nums[k - 1]) {
                                    k--;
                              }
                              j++;
                              k--;
                        }
                        if (sum < 0) {
                              while (j < k && nums[j] == nums[j + 1]) {
                                    j++;
                              }
                              j++;
                        }
                        if (sum > 0) {
                              while (j < k && nums[k] == nums[k - 1]) {
                                    k--;
                              }
                              k--;
                        }
                  }
            }
            return ans;
      }
      
}
