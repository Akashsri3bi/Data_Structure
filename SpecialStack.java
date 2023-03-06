import java.util.Stack;

public class SpecialStack {

      public void push(int a, Stack<Integer> s) {
            // add code here.
            s.push(a);
      }

      public int pop(Stack<Integer> s) {
            // add code here.
            return s.pop();
      }

      public int min(Stack<Integer> s) {
            // add code here.
            int min = Integer.MAX_VALUE;
            while (!s.isEmpty()) {
                  int x = s.pop();
                  if (min > x) {
                        min = x;
                  }
            }

            return min;
      }

      public boolean isFull(Stack<Integer> s, int n) {
            // add code here.
            if (s.size() == n) {
                  return true;
            } else {
                  return false;
            }
      }

      public boolean isEmpty(Stack<Integer> s) {
            // add code here.
            return s.isEmpty();
      }
      
}
