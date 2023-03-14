import java.util.Stack;

public class LargestRectangularArea {

      // Function to find largest rectangular area possible in a given histogram.
      public static long getMaxArea(long hist[], long n) {
            // your code here
            long[] ps = prevSmaller(hist);
            long[] ns = nextSmaller(hist);
            long maxArea = 0;
            for (int i = 0; i < n; i++) {
                  if (ns[i] == -1) {
                        ns[i] = n;
                  }

                  long area = (ns[i] - ps[i] - 1) * hist[i];
                  maxArea = Math.max(maxArea, area);

            }

            return maxArea;

      }

      public static long[] prevSmaller(long[] arr) {
            int n = arr.length;
            long[] ps = new long[n];

            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < n; i++) {
                  while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                        st.pop();
                  }
                  if (st.isEmpty()) {
                        ps[i] = -1;
                  } else {
                        ps[i] = st.peek();
                  }
                  st.push(i);
            }

            return ps;

      }

      public static long[] nextSmaller(long[] arr) {
            int n = arr.length;
            long[] ns = new long[n];

            Stack<Integer> st = new Stack<>();
            for (int i = n - 1; i >= 0; i--) {
                  while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                        st.pop();
                  }
                  if (st.isEmpty()) {
                        ns[i] = -1;
                  } else {
                        ns[i] = st.peek();
                  }
                  st.push(i);
            }

            return ns;

      }
      
}
