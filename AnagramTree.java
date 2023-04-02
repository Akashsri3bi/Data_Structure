import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class AnagramTree {

      static class Node {
            Node left, right;
            int data;

            Node(int data) {
                  this.data = data;
                  left = null;
                  right = null;
            }
      }

      public static boolean areAnagrams(Node node1, Node node2) {
            // code here
            if (node1 == null && node2 == null) {
                  return true;
            }
            if (node1 == null || node2 == null) {
                  return false;
            }

            Queue<Node> q1 = new LinkedList<Node>();
            Queue<Node> q2 = new LinkedList<Node>();
            q1.add(node1);
            q2.add(node2);

            while (true) {
                  int n1 = q1.size(), n2 = q2.size();

                  // If n1 and n2 are different
                  if (n1 != n2)
                        return false;

                  if (n1 == 0)
                        break;

                  ArrayList<Integer> curr_level1 = new ArrayList<>();
                  ArrayList<Integer> curr_level2 = new ArrayList<>();
                  while (n1 > 0) {
                        Node root1 = q1.peek();
                        q1.remove();
                        if (root1.left != null)
                              q1.add(root1.left);
                        if (root1.right != null)
                              q1.add(root1.right);
                        n1--;

                        Node root2 = q2.peek();
                        q2.remove();
                        if (root2.left != null)
                              q2.add(root2.left);
                        if (root2.right != null)
                              q2.add(root2.right);

                        curr_level1.add(root1.data);
                        curr_level2.add(root2.data);
                  }

                  Collections.sort(curr_level1);
                  Collections.sort(curr_level2);

                  if (!curr_level1.equals(curr_level2))
                        return false;
            }

            return true;
      }
      
}
