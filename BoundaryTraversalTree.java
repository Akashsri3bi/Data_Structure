import java.util.ArrayList;
import java.util.Stack;

public class BoundaryTraversalTree {

      class Node {
            int data;
            Node left, right;

            Node(int data) {
                  data = data;
                  left = null;
                  right = null;
            }
      }

      ArrayList<Integer> boundary(Node node) {
            ArrayList<Integer> list = new ArrayList<>();
            if (node == null) {
                  return list;
            }

            if (!isLeaf(node)) {
                  list.add(node.data);
            }

            traverseLeft(node, list);
            traverseLeaf(node, list);
            traverseRight(node, list);

            return list;

      }

      static boolean isLeaf(Node root) {
            if (root.left == null && root.right == null) {
                  return true;
            } else {
                  return false;
            }
      }

      static void traverseLeft(Node root, ArrayList<Integer> list) {
            Node curr = root.left;
            while (curr != null) {
                  if (!isLeaf(curr)) {
                        list.add(curr.data);
                  }
                  if (curr.left != null) {
                        curr = curr.left;
                  } else {
                        curr = curr.right;
                  }
            }
      }

      static void traverseRight(Node root, ArrayList<Integer> list) {
            Node curr = root.right;
            Stack<Integer> s = new Stack<>();
            while (curr != null) {
                  if (!isLeaf(curr)) {
                        s.push(curr.data);
                  }
                  if (curr.right != null) {
                        curr = curr.right;
                  } else {
                        curr = curr.left;
                  }
            }
            while (!s.empty()) {
                  list.add(s.pop());
            }
      }

      static void traverseLeaf(Node root, ArrayList<Integer> list) {
            if (isLeaf(root)) {
                  list.add(root.data);
                  return;
            }
            if (root.left != null) {
                  traverseLeaf(root.left, list);
            }
            if (root.right != null) {
                  traverseLeaf(root.right, list);
            }
      }
      
}
