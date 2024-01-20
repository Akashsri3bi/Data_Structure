public class DistributeCandy {

      int ans;

      public int distributeCandy(Node root) {
            // code here
            dfs(root);
            return ans;
      }

      public int dfs(Node root) {
            if (root == null) {
                  return 0;
            }
            int l = dfs(root.left);
            int r = dfs(root.right);
            ans += Math.abs(l) + Math.abs(r);
            return root.data + l + r - 1;
      }
      
}
