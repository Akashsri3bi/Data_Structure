public class MinBst {

      class Node {
            int data;
            Node left, right;

            public Node(int data) {
                  this.data = data;
            }
      }

      int minValue(Node node) {
            if (node == null) {
                  return -1;
            }
            if (node.left == null) {
                  return node.data;
            }
            return minValue(node.left);

      }
      
}
