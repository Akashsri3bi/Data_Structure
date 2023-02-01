import java.util.HashMap;

public class MaxNonAd {

      class Node {
            int data;
            Node left, right;

            Node(int data) {
                  this.data = data;
                  this.left = null;
                  this.right = null;
            }
      }

      static HashMap<Node, Integer> map = new HashMap<>();

      static int getMaxSum(Node root) {
            // add your code here
            if(root==null){
                  return 0;
            }
            //Optimize 
            if(map.containsKey(root)){
                  return map.get(root) ;
            }
            //With node 
            int withnode = root.data ;


            if(root.left!=null){
            withnode+= getMaxSum(root.left.left) ; 
            withnode+= getMaxSum(root.left.right) ; 
            }

            if(root.right!=null){
            withnode+= getMaxSum(root.right.left) ;
            withnode+= getMaxSum(root.right.right) ; 
            }

            //CASE 2
            int withoutnode = getMaxSum(root.left) + getMaxSum(root.right) ; 

            map.put(root ,Math.max(withnode, withoutnode)) ; 
            return map.get(root) ;

      public static void main(String[] args) {
            
      }
      
}
