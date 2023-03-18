import java.util.Stack;

public class StackPermutation {

      public static int isStackPermutation(int n, int[] ip, int[] op) {
            // code here
            Stack<Integer> st = new Stack<>();
            int k = 0;

            for (int i = 0; i < n; i++) {
                  st.push(ip[i]);
                  if (st.peek() == op[k]) {
                        while (!st.isEmpty() && st.peek() == op[k]) {
                              st.pop();
                              k++;
                        }
                  }
            }

            if (st.isEmpty()) {
                  return 1;
            }
            return 0;
      }
      
}
