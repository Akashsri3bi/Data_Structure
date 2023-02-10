public class PopulateInorder {

      class Node {
            int data;
            Node left, right;
            
            public Node(int data) {
                  this.data = data;
            }
      }

      Node succ = null;

      public void populateNext(Node root) {
            // code here
            if (root == null) {
                  return;
            }
            populateNext(root.right);
            root.next = succ;
            succ = root;
            populateNext(root.left);
      }
      
}
