public class SlidingWindow {

      class Solution {
            static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
                  // Your code here
                  ArrayList<Integer> al = new ArrayList<>();
                  int i = 0, j = 0, max = Integer.MIN_VALUE;
                  while (j < n) {
                        max = Math.max(max, arr[j]);
                        if (j - i + 1 < k)
                              j++;
                        else if (j - i + 1 == k) {
                              al.add(max);

                              if (arr[i] != max) {
                                    i++;
                                    j++;
                              } else {
                                    i++;
                                    j = i;
                                    max = Integer.MIN_VALUE;
                              }
                        }
                  }
                  return al;
            }
      }
      
}
