public class BSTPRE {
      class Node {
            int data;
            Node left, right;

            public Node(int data) {
                  this.data = data;
            }
      }

      int i = 0;

      public Node bstFromPreorder(int[] A) {
            return bstFromPreorder(A, Integer.MAX_VALUE);
      }

      public Node bstFromPreorder(int[] A, int bound) {
            if (i == A.length || A[i] > bound)
                  return null;
            Node root = new Node(A[i++]);
            root.left = bstFromPreorder(A, root.val);
            root.right = bstFromPreorder(A, bound);
            return root;
      }
      
}
