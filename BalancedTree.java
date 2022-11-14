public class BalancedTree {
      class Node {
            int val;
            Node left, right;

            Node(int data) {
                  val = data;
                  left = null;
                  right = null;
            }
      }
      boolean isBalanced(Node root) {
            if (root == null) {
                  return true;
            }
            return (Math.abs(height(root.left)-height(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right));
      }

      int height(Node root){
            if(root==null){
                  return 0 ; 
            }
            int lheight = height(root.left) ;
            int rheight = height(root.right) ; 
            if(lheight>rheight){
                  return lheight+1 ; 
            }
            else{
                  return rheight+1 ; 
            } 
      }
      
}
