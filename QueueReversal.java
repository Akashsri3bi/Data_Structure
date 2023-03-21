import java.util.Queue;
import java.util.Stack;

public class QueueReversal {

      public Queue<Integer> rev(Queue<Integer> q) {
            // add code here.
            Stack<Integer> s = new Stack<>();
            while (!q.isEmpty()) {
                  int element = q.peek();
                  q.remove();
                  s.push(element);
            }

            while (!s.isEmpty()) {
                  int element = s.peek();
                  s.pop();
                  q.add(element);

            }

            return q;
      }
      
}
