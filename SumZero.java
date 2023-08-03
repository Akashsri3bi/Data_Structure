import java.util.HashMap;

public class SumZero {

      int maxLen(int arr[], int n) {
            // Your code here
            HashMap<Integer, Integer> map = new HashMap<>();
            int sum = 0;
            int maxLen = 0;
            map.put(0, -1);
            for (int i = 0; i < n; i++) {
                  sum += arr[i];
                  if (map.containsKey(sum)) {
                        maxLen = Math.max(maxLen, i - map.get(sum));
                  } else {
                        map.put(sum, i);
                  }
            }

            return maxLen;
      }
      
}
