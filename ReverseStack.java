import java.util.Stack;

public class ReverseStack {

      static void insertAtBottom(Stack<Integer> s, int a) {
            if (s.isEmpty()) {
                  s.push(a);
                  return;
            } else {
                  int x = s.peek();
                  s.pop();
                  insertAtBottom(s, a);
                  s.push(x);
            }
      }

      static void reverse(Stack<Integer> s) {
            // add your code here
            if (s.isEmpty()) {
                  return;
            }
            int a = s.peek();
            s.pop();
            reverse(s);
            insertAtBottom(s, a);
      }
      
}
