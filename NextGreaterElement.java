import java.util.Stack;

public class NextGreaterElement {

      public static long[] nextLargerElement(long[] arr, int n) {
            // Your code here
            Stack<Long> s = new Stack<>();
            long[] arr1 = new long[n];
            s.push(arr[n - 1]);
            arr1[n - 1] = -1;
            for (int i = n - 2; i >= 0; i--) {
                  while (s.size() > 0 && arr[i] >= s.peek()) {
                        s.pop();
                  }
                  if (s.size() == 0) {
                        arr1[i] = -1;
                  } else {
                        arr1[i] = s.peek();
                  }
                  s.push(arr[i]);
            }

            return arr1;
      }
      
}
