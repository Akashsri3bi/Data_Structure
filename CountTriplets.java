import java.util.Arrays;

import javax.management.MBeanAttributeInfo;

public class CountTriplets {

      //Count triplets with sum less than X
      
      long countTriplets(long arr[], int n, int sum) {
            Arrays.sort(arr);
            int count = 0;
            for (int i = 0; i < n; i++) {
                  int target = sum - (int) arr[i];
                  int left = i + 1;
                  int right = n - 1;
                  while (left < right) {
                        int temp = (int) (arr[left] + arr[right]);
                        if (temp < target) {
                              count += (right - left);
                              left++;
                        } else {
                              right--;
                        }
                  }
            }

            return count;
      }

      public static void main(String[] args) {
            
      }
      
}
