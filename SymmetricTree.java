public class SymmetricTree {

      static boolean f(Node l, Node r) {
            if (l == null && r == null) {
                  return true;
            }
            if (l == null || r == null) {
                  return false;
            }
            if (l.data != r.data) {
                  return false;
            }
            return f(l.left, r.right) && f(l.right, r.left);
      }

      public static boolean isSymmetric(Node root) {
            // add your code here;
            if (root == null || root.left == null && root.right == null) {
                  return true;
            }

            return f(root.left, root.right);

      }
      
}
