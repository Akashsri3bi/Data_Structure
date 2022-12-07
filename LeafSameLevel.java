import java.util.HashSet;

class Node {
      Node left, right;
      int data;

      Node(int d) {
            data = d;
            left = right = null;
      }

}

public class LeafSameLevel {
      public static void c(Node root, int level, HashSet<Integer> h) {
            if (root == null) {
                  return;
            }
            if (root.left == null && root.right == null) {
                  h.add(level);
            }
            c(root.left, level + 1, h);
            c(root.right, level + 1, h);
      }

      boolean check(Node root) {
            HashSet<Integer> h = new HashSet<>();
            c(root, 0, h);
            if (h.size() == 1) {
                  return true;
            }
            return false;
            // Your code here

      }
      public static void main(String[] args) {
            
      }
      
}
