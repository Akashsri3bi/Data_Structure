public class TransformtoSumTree {

      class Node {
            Node left, right;
            int data;

            Node(int d) {
                  data = d;
                  left = right = null;
            }

      }

      private int sum(Node root){
            if(root==null){
                  return 0; 
            }
            if(root.left==null && root.right==null){
                  int res = root.data ; 
                  root.data = 0 ;
                  return res ;
            }

            int left = sum(root.left) ; 
            int right = sum(root.right) ; 
            int odata = root.data ; 
            root.data = left+right ; 
            return odata+root.data ; 
      }

      public void toSumTree(Node root) {
            // add code here.
            if(root==null){
                  return ; 
            }
            sum(root) ; 
      }
      
}
