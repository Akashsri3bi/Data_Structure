import java.util.ArrayDeque;
import java.util.Queue;

public class BTreeToDLL {

      class Node {
            Node left, right;
            int data;

            Node(int d) {
                  data = d;
                  left = right = null;
            }

      }

      // Function to convert binary tree to doubly linked list and return it.
      static void inorderConversion(Node root, Queue<Node> q) {
            if (root == null) {
                  return;
            }
            inorderConversion(root.left, q);
            q.add(root);
            inorderConversion(root.right, q);
      }

      Node bToDLL(Node root) {
            Queue<Node> q = new ArrayDeque<>();
            inorderConversion(root, q);
            Node head = q.poll();
            Node temp = head;
            while (!q.isEmpty()) {
                  Node curr = q.poll();
                  curr.left = temp;
                  temp.right = curr;
                  temp = curr;
            }

            return head;
      }
      
}
