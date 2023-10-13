public class FloorInBst {

      public static int floor(Node root, int x) {
            // Code here
            int ans = -1;
            while (root != null) {
                  if (x >= root.data) {
                        ans = root.data;
                        root = root.right;
                  } else if (x < root.data) {
                        root = root.left;
                  }
            }
            return ans;
      }
      
}
