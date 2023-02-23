public class ImplementStack {

      StackNode top;

      // Function to push an integer into the stack.
      void push(int a) {
            StackNode sn = new StackNode(a);
            // Add your code here
            if (top == null) {
                  top = sn;
            } else {
                  sn.next = top;
                  top = sn;
            }
      }

      // Function to remove an item from top of the stack.
      int pop() {
            int data = -1;
            // Add your code here
            if (top != null) {
                  data = top.data;
                  top = top.next;
            }

            return data;

      }
      
}
