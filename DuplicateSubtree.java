import java.util.HashMap;

public class DuplicateSubtree {

      HashMap<String, Integer> map = new HashMap<>();

      int dupSub(Node root) {
            add(root);
            
            for (int item : map.values()) {
                  if (item >= 2) {
                        return 1;
                  }
            }

            return 0;
      }

      public String add(Node root) {
            if (root == null) {
                  return "$";
            }
            if (root.left == null && root.right == null) {
                  String s = String.valueOf(root.data);
                  return s;
            }
            String left = add(root.left);
            String right = add(root.right);
            String s = (left + " " + String.valueOf(root.data) + " " + right);
            if (map.containsKey(s)) {
                  map.put(s, map.get(s) + 1);
            } else {
                  map.put(s, 1);
            }
            return s;
      }

      public static void main(String[] args) {
            
      }
      
}
