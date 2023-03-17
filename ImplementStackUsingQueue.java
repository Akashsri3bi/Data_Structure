import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {

      Queue<Integer> q1 = new LinkedList<Integer>();
      Queue<Integer> q2 = new LinkedList<Integer>();

      // Function to push an element into stack using two queues.
      void push(int a) {
            // Your code here
            q1.add(a);
            while (!q2.isEmpty()) {
                  q1.add(q2.peek());
                  q2.remove();
            }

            while (!q1.isEmpty()) {
                  q2.add(q1.peek());
                  q1.remove();
            }
      }

      // Function to pop an element from stack using two queues.
      int pop() {
            // Your code here
            if (q2.isEmpty())
                  return -1;
            return q2.remove();
      }
      
}
