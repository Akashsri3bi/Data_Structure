import java.util.Stack;

public class ValidSubstring {

      static int findMaxLen(String S) {
            if (S == null || S.length() < 2) {
                  return 0;
            }
            // code here
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < S.length(); i++) {
                  char c = S.charAt(i);
                  if (c == '(') {
                        st.push(i);
                  } else {
                        if (!st.isEmpty() && S.charAt(st.peek()) == '(') {
                              st.pop();
                        } else {
                              st.push(i);
                        }
                  }
            }

            int max = 0;
            int end = S.length();
            while (!st.isEmpty()) {
                  int ele = st.pop();
                  max = Math.max(max, end - ele - 1);
                  end = ele;
            }

            return Math.max(end, max);
      }
      
}
