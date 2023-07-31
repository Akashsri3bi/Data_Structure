class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
public class NodeTree {

      static int solve(Node node) {
            if (node == null) {
                  return 0;
            }
            int notTake = solve(node.left) + solve(node.right);

            int take = 1;
            if (node.left != null) {
                  take += solve(node.left.left) + solve(node.left.right);
            }
            if (node.right != null) {
                  take += solve(node.right.left) + solve(node.right.right);
            }

            return Math.max(take, notTake);
      }

      public int LISS(Node node) {
            // Write your code here
            return solve(node);
      }
      
}
