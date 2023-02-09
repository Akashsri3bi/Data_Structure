public class PredSucc {

      class Node {
            int data;
            Node left, right;

            public Node(int data) {
                  this.data = data;
            }
      }

      public static void findPreSuc(Node root, Res p, Res s, int key) {
            if (root == null) {
                  return;
            }
            if (root.data == key) {
                  if (root.left != null) {
                        Node k = root.left;
                        while (k.right != null) {
                              k = k.right;
                        }
                        p.pre = k;
                  }
                  if (root.right != null) {
                        Node k = root.right;
                        while (k.left != null) {
                              k = k.left;
                        }
                        s.succ = k;
                  }

                  return;
            }
            if (root.data > key) {
                  s.succ = root;
                  findPreSuc(root.left, p, s, key);
            }
            if (root.data < key) {
                  p.pre = root;
                  findPreSuc(root.right, p, s, key);
            }
      }
      
}
