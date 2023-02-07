public class InsertNode {

      class Node {
            int data;
            Node left, right;

            public Node(int data) {
                  this.data = data;
            }
      }

      Node insert(Node root, int Key) {

            if (root == null) {

                  root = new Node(Key);

                  return root;

            }

            if (root.data == Key) {

                  return root;

            }

            if (root.data > Key) {

                  root.left = insert(root.left, Key);

            }

            else if (root.data < Key) {

                  root.right = insert(root.right, Key);

            }

            return root;

      }
      
}
