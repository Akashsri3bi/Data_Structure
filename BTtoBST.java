import java.util.ArrayList;
import java.util.Collections;

public class BTtoBST {

      class Node {
            int data;
            Node left, right;

            public Node(int data) {
                  this.data = data;
            }
      }

      void inorder(Node root, ArrayList<Integer> temp) {
            if (root == null) {
                  return;
            }
            inorder(root.left, temp);
            temp.add(root.data);
            inorder(root.right, temp);
      }

      Node inordertobst(ArrayList<Integer> list, int start, int end) {
            if (start > end) {
                  return null;
            }
            int mid = (start + end) / 2;
            Node newnode = new Node(list.get(mid));
            newnode.left = inordertobst(list, start, mid - 1);
            newnode.right = inordertobst(list, mid + 1, end);

            return newnode;
      }

      Node binaryTreeToBST(Node root) {
            // Your code here
            ArrayList<Integer> list = new ArrayList<>();
            inorder(root, list);
            Collections.sort(list);
            Node result = inordertobst(list, 0, list.size() - 1);
            return result;
      }
      
}
