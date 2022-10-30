import java.util.ArrayDeque;
import java.util.HashMap;

public class FirstNonRepeating {

      public String FirstNonRepeating(String A) {
            // code here
            StringBuilder sb = new StringBuilder();
            HashMap<Character, Integer> map = new HashMap<>();
            ArrayDeque<Character> q = new ArrayDeque<>();
            for (int i = 0; i < A.length(); i++) {
                  char c = A.charAt(i);
                  if (map.containsKey(c) == false) {
                        q.add(c);
                        map.put(c, 1) ;
                  }else{
                        map.put(c, map.get(c)+1) ; 
                  }
                 
                  while (!q.isEmpty()) {
                        if (map.get(q.peek()) > 1){
                              q.poll();
                        } else {
                              sb.append(q.peek());
                              break;
                        }
                  }
                  if (q.isEmpty()) {
                        sb.append('#');
                  }
            }
            return sb.toString();
      }

      public static void main(String[] args) {
            
      }
      
}
