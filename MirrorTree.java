public class MirrorTree {

      class Node {
            int data;
            Node left;
            Node right;

            Node(int data) {
                  this.data = data;
                  left = null;
                  right = null;
            }
      }

      Node createNode(int val){
            Node newnode = new Node(val) ;
            newnode.left = null ; 
            newnode.right = null ; 
            return newnode ;   
      }

      Node mirrorify(Node root){
            if(root==null){
                  return  null; 
            }

            Node mirror = createNode(root.data) ; 

            mirror.left = mirrorify(root.right) ; 
            mirror.right = mirrorify(root.left) ;

            return mirror ; 
      }


      public static void main(String[] args) {
            
      }
      
}
