public class MaxXOR {

      static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
      }

      public static int maxSubsetXOR(int arr[], int n) {
            // add code here.
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                  max = Math.max(max, arr[i]);
            }

            int msb = 31;
            for (int i = 31; i >= 0; i--) {
                  int ithBit = (max >> i) & 1;
                  if (ithBit == 1) {
                        msb = i;
                        break;
                  }
            }

            // Real Solution Starts
            int curr_index = 0;
            for (int i = msb; i >= 0; i--) {
                  int maxInd = 0;
                  int maxEle = Integer.MIN_VALUE;
                  for (int j = curr_index; j < n; j++) {
                        // find bit set or not for that msb or position for this number
                        // and also to find the max number first whose bit is set for
                        // position
                        int setBit = (arr[j] >> i) & 1;
                        if (setBit == 1 && arr[j] > maxEle) {
                              maxEle = arr[j];
                              maxInd = j;
                        }
                  }

                  if (maxEle == Integer.MIN_VALUE) {
                        continue;
                  }

                  swap(arr, curr_index, maxInd);

                  // Now perform XOR operation

                  for (int k = 0; k < n; k++) {
                        if (k == curr_index) {
                              continue;
                        }
                        if (((arr[k] >> i) & 1) == 1) {
                              arr[k] = arr[k] ^ arr[curr_index];
                        }
                  }
                  curr_index++;
            }

            // XOR Of All Elements -->
            int ans = 0;
            for (int i = 0; i < n; i++) {
                  ans = ans ^ arr[i];
            }

            return ans;

      }
      
}
