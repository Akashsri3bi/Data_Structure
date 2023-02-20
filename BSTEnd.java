public class BSTEnd {

      public static boolean helper(Node root, int l, int r) {
            if (root == null) {
                  return false;
            }

            if (root.data - l == 1 && r - root.data == 1) {
                  return true;
            }

            return helper(root.left, l, root.data) || helper(root.right, root.data, r);

      }

      public static boolean isDeadEnd(Node root) {
            // Add your code here.
            int max = Integer.MAX_VALUE;
            boolean flag = helper(root, 0, max);
            return flag;
      }
      
}
