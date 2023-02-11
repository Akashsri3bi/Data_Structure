public class LCABST {

      class Node {
            int data;
            Node left, right;

            public Node(int data) {
                  this.data = data;
            }
      }

      Node LCA(Node root, int n1, int n2) {
            // code here.
            if (root == null) {
                  return root;
            }

            if (root.data == n1 || root.data == n2) {
                  return root;
            }

            Node left = LCA(root.left, n1, n2);
            Node right = LCA(root.right, n1, n2);
            if (left == null) {
                  return right;
            } else if (right == null) {
                  return left;
            } else {
                  return root;
            }

      }
      
}
