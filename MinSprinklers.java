import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MinSprinklers {

      int min_sprinklers(int gallery[], int n) {
        List<int[]> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (gallery[i] > -1) {
                arr.add(new int[]{i - gallery[i], i + gallery[i]});
            }
        }
        Collections.sort(arr, (a, b) -> Integer.compare(a[0], b[0])); // Corrected lambda expression
        int ans = 0, target = 0, i = 0;
        while (target < n) {
            if (i == arr.size() || arr.get(i)[0] > target) {
                return -1;
            }
            int max_range = arr.get(i)[1];
            while (i + 1 < arr.size() && arr.get(i + 1)[0] <= target) {
                i++;
                max_range = Math.max(max_range, arr.get(i)[1]);
            }
            if (max_range < target) {
                return -1;
            }
            ans++;
            target = max_range + 1;
            i++;
        }
        return ans;
    }
      
}
