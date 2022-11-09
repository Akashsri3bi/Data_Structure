import java.util.Stack;

public class PreorderTraversal {
      //Recursive Approach
      
      class Node {
            int val;
            Node left, right;

            Node(int data) {
                  val = data;
                  left = null;
                  right = null;
            }
      }

      void preorder(Node root){
            if(root==null){
                  return  ; 
            }

            System.out.print(root.val+" ");
            preorder(root.left);
            preorder(root.right);
      }

      //Iterative Approach
      void Iterativepreorder(Node root){
            if(root==null){
                  return ;
            }
            Stack<Node> stack = new Stack<>() ;
            stack.push(root); 

            while(!stack.isEmpty()){
                  Node curr = stack.pop();
                  System.out.print(curr.val + " ");
                  if(curr.right!=null){
                        stack.push(curr.right) ; 
                  }
                  if(curr.left!=null){
                        stack.push(curr.left) ;
                  }

            }
      }
}
