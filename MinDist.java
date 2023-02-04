class MinDist{

      public static void main(String[] args) {
            
      }
      Node lca(Node root, int a, int b) {
            if (root == null)
                  return null;
            if (root.data == a || root.data == b)
                  return root;
            Node left = lca(root.left, a, b);
            Node right = lca(root.right, a, b);
            if (left == null)
                  return right;
            if (right == null)
                  return left;

            return root; // if both left and right is not null
      }

      int getDist(Node root, int d) {
            if (root == null)
                  return -1;
            if (root.data == d)
                  return 0;
            int l = getDist(root.left, d);
            int r = getDist(root.right, d);
            if (l == -1 && r == -1)
                  return -1;
            else if (l == -1)
                  return r + 1;
            else
                  return l + 1;

      }

      int minDist(Node root, int a, int b) {
            int distA = getDist(root, a);
            int distB = getDist(root, b);
            return (distA + distB);
      }

      int findDist(Node root, int a, int b) {
            // Your code here
            // First we will find the lowest common ancestor for both node
            Node lca = lca(root, a, b);
            // Now we will find distance to both a and b from lca
            int dist = minDist(lca, a, b);
            return dist;
      }
}