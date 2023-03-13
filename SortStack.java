import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SortStack {

      // add code here.
      public Stack<Integer> sort(Stack<Integer> s) {
            // add code here.
            ArrayList<Integer> list = new ArrayList<>();
            while (!s.isEmpty()) {
                  list.add(s.pop());
            }
            Collections.sort(list);
            for (int a : list) {
                  s.push(a);
            }
            return s;
      }
      
}
