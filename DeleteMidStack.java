import java.util.Stack;

public class DeleteMidStack {

      // Function to delete middle element of a stack.
      public void deleteMid(Stack<Integer> s, int sizeOfStack) {
            // code here
            if (s.size() == Math.ceil((sizeOfStack + 1) / 2)) {
                  s.pop();
                  return;
            }
            int x = s.pop();
            deleteMid(s, sizeOfStack);
            s.push(x);

      }
      
}
