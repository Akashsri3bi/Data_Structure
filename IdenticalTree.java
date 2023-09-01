public class IdenticalTree {

      boolean isIdentical(Node root1, Node root2) {
            // Code Here
            if (root1 == null && root2 == null)
                  return true;
            if (root1 != null && root2 == null)
                  return false;
            if (root1 == null && root2 != null)
                  return false;

            int data1 = root1.data;
            int data2 = root2.data;

            boolean lp = isIdentical(root1.left, root2.left);
            boolean rp = isIdentical(root1.right, root2.right);

            if (lp && rp && data1 == data2) {
                  return true;
            } else {
                  return false;
            }
      }
      
}
