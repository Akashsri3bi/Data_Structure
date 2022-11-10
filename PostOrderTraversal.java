import java.util.Stack;

public class PostOrderTraversal {

      class Node {
            int val;
            Node left, right;

            Node(int data) {
                  val = data;
                  left = null;
                  right = null;
            }
      }

      //Post Order Traversal 

      void postorder(Node root){
            if(root==null){
                  return ; 
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.val+" ");
      }

      //PostOrder Iterative
      void Iterativepostorder(Node root){
            if(root==null){
                  return  ; 
            }
            Stack<Node> stack = new Stack<>() ; 
            stack.push(root) ; 

            Stack<Integer> out = new Stack<>() ;
            //Create another stack to store postorderTraversal
            while(!stack.isEmpty()){
                  Node curr = stack.pop() ; 
                  out.push(curr.val) ;
                  
                  if(curr.left!=null){
                        stack.push(curr.left) ; 
                  }
                  if(curr.right!=null){
                        stack.push(curr.right) ; 
                  }
            }
            while(!out.isEmpty()){
                  System.out.print(out.pop()+" ") ; 
            }
      }
      
}
