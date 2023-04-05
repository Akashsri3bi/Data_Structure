import java.util.Stack;

public class HelpClassmates {

      public static int[] help_classmate(int arr[], int n) {
            // Your code goes here
            int[] ans = new int[arr.length];
            Stack<Integer> st = new Stack<>();
            st.push(-1);
            for (int i = n - 1; i >= 0; i--) {
                  while (st.peek() >= arr[i]) {
                        st.pop();
                  }
                  ans[i] = st.peek();
                  st.push(arr[i]);
            }

            return ans;
      }
      
}
