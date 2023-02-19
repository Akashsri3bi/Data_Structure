class PreOrdertoBST{
      static Node solve(Node root, int val) {
            if (root == null) {
                  root = new Node(val);
                  return root;
            }
            if (root.data < val) {
                  root.right = solve(root.right, val);
            }
            if (root.data > val) {
                  root.left = solve(root.left, val);
            }
            return root;
      }

      public static Node post_order(int pre[], int size) {
            Node root = null;
            for (int i = 0; i < size; i++) {
                  root = solve(root, pre[i]);
            }

            return root;
      }
}