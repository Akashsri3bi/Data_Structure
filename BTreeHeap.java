import java.util.*;

public class BTreeHeap {

      class Node {
            int data;
            Node left, right;

            Node(int d) {
                  data = d;
                  left = right = null;
            }
      }
      boolean isHeap(Node tree) {
            // code here
            if (tree == null) {
                  return true;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(tree);
            boolean flag = false;
            while (!q.isEmpty()) {
                  Node temp = q.poll();
                  if (temp.left != null) {
                        if (flag == true || temp.data < temp.left.data) {
                              return false;
                        }
                        q.add(temp.left);
                  } else {
                        flag = true;
                  }
                  if (temp.right != null) {
                        if (flag == true || temp.data < temp.right.data) {
                              return false;
                        }
                        q.add(temp.right);
                  } else {
                        flag = true;
                  }
            }

            return true;

      }
      
}
