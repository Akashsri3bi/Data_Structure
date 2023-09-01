public class AVLDel {

      static Node minValueNode(Node node) {
            Node current = node;

            /* loop down to find the leftmost leaf */
            while (current.left != null)
                  current = current.left;

            return current;
      }

      static int height(Node N) {
            if (N == null)
                  return 0;
            return N.height;
      }

      static int balanceFactor(Node N) {
            if (N == null)
                  return 0;
            return height(N.left) - height(N.right);
      }

      static Node rightRotate(Node root) {
            Node x = root.left;
            Node temp = x.right;
            x.right = root;
            root.left = temp;
            root.height = Math.max(height(root.left), height(root.right)) + 1;
            x.height = Math.max(height(x.left), height(x.right)) + 1;
            return x;
      }

      static Node leftRotate(Node root) {
            Node x = root.right;
            Node temp = x.left;
            x.left = root;
            root.right = temp;

            root.height = Math.max(height(root.left), height(root.right)) + 1;
            x.height = Math.max(height(x.left), height(x.right)) + 1;

            return x;

      }

      public static Node deleteNode(Node root, int key) {
            // code here.
            if (root == null) {
                  return root;
            }

            if (key < root.data) {
                  root.left = deleteNode(root.left, key);
            }

            else if (key > root.data) {
                  root.right = deleteNode(root.right, key);
            } else {
                  if (root.left == null) {
                        Node temp = root.right;
                        root = temp;
                  } else if (root.right == null) {
                        Node temp = root.left;
                        root = temp;
                  } else {
                        Node temp = minValueNode(root.right);
                        root.data = temp.data;
                        root.right = deleteNode(root.right, temp.data);
                  }
            }

            if (root == null) {
                  return root;
            }

            // Updating Root height because now element is deleted ;
            root.height = Math.max(height(root.left), height(root.right)) + 1;

            int bf = balanceFactor(root);

            // We will check 6 cases using for conditions
            if (bf > 1 && balanceFactor(root.left) >= 0) {
                  return rightRotate(root);
            }
            if (bf > 1 && balanceFactor(root.left) < 0) {
                  root.left = leftRotate(root.left);
                  return rightRotate(root);
            }
            if (bf < -1 && balanceFactor(root.right) <= 0) {
                  return leftRotate(root);
            }
            if (bf < -1 && balanceFactor(root.right) > 0) {
                  root.right = rightRotate(root.right);
                  return leftRotate(root);
            }

            return root;

      }
      
}
