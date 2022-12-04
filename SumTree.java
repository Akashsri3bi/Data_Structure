public class SumTree {

      class Node {
            Node left, right;
            int data;

            Node(int d) {
                  data = d;
                  left = right = null;
            }

      }

      static int sumTree(Node root) {
            if (root == null) {
                  return 0;
            }
            if (root.left == null && root.right == null) {
                  return root.data;
            }

            int left = sumTree(root.left);
            int right = sumTree(root.right);

            if (left == -1 || right == -1) {
                  return -1;
            }
            if (left + right != root.data) {
                  return -1;
            }

            return root.data + left + right;

      }

      boolean isSumTree(Node root) {
            return sumTree(root) != -1;
      }
      
}
