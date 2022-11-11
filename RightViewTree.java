import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class RightViewTree {

      class Node {
            int val;
            Node left, right;

            Node(int data) {
                  val = data;
                  left = null;
                  right = null;
            }
      }

      ArrayList<Integer> rightView(Node node) {
            ArrayList<Integer> list = new ArrayList<>();
            rightCheck(node, list, 0);
            return list ; 
      }

      public static void rightCheck(Node root, ArrayList<Integer> list, int level) {
            if (root == null) {
                  return;
            }
            if (level == list.size()) {
                  list.add(root.val);
            }

            rightCheck(root.right, list, level + 1);
            rightCheck(root.left, list, level + 1);
      }
      
}
