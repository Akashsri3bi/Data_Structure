public class HeightTree {

      class Node {
            Node left, right;
            int data;

            Node(int item) {
                  data = item;
                  left = right = null;
            }
      }

      int height(Node node) {
            if (node == null) {
                  return 0;
            }
            return Math.max(height(node.left), height(node.right))+1 ; 
      }

      public static void main(String[] args) {
            
      }
      
}
