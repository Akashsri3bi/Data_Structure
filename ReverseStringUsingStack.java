import java.util.Stack;

public class ReverseStringUsingStack {

      public String reverse(String S) {
            // code here
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < S.length(); i++) {
                  st.push(S.charAt(i));
            }
            String k = "";
            while (!st.isEmpty()) {
                  k = k + st.pop();
            }

            return k;
      }
}
