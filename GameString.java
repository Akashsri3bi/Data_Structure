import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GameString {

      static int minValue(String s, int k) {
            // code here
            Map<Character, Integer> freq = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                  char c = s.charAt(i);
                  freq.put(c, freq.getOrDefault(c, 0) + 1);
            }

            ArrayList<Integer> list = new ArrayList<>(freq.values());
            Collections.sort(list, Collections.reverseOrder());

            for (int i = 0; i < k; i++) {
                  list.set(0, list.get(0) - 1);
                  if (list.get(0) == 0) {
                        list.remove(0);
                  }

                  Collections.sort(list, Collections.reverseOrder());
            }

            int value = 0;
            for (int f : list) {
                  value += f * f;
            }

            return value;
      }
      
}
