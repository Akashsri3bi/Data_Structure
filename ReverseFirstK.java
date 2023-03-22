import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstK {

      public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
            // add code here.
            Stack<Integer> st = new Stack<>();
            Queue<Integer> ans = new LinkedList<>();
            while (st.size() != k) {
                  st.push(q.peek());
                  q.remove();
            }

            while (!st.isEmpty()) {
                  ans.add(st.peek());
                  st.pop();
            }

            while (!q.isEmpty()) {
                  ans.add(q.peek());
                  q.remove();
            }

            return ans;

      }
      
}
