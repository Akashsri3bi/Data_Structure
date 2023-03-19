import java.util.Stack;

public class QueueUsingStack {
      Stack<Integer> s1 = new Stack<Integer>();
      Stack<Integer> s2 = new Stack<Integer>();

      // Function to push an element in queue by using 2 stacks.
      void Push(int x) {
            // Your code here
            s1.push(X);

      }

      // Function to pop an element from queue by using 2 stacks.
      int Pop() {
            // Your code here
            if (s1.isEmpty()) {
                  return -1;
            }

            while (!s1.isEmpty()) {
                  s2.push(s1.pop());
            }

            int l = s2.pop();
            while (!s2.isEmpty()) {
                  s1.push(s2.pop());
            }

            return l;
      }
}
